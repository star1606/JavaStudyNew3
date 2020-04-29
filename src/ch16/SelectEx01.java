package ch16;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectEx01 {
	// 데이터베이스 연결할건데 JDBC드라이버호출할거임

	public static void main(String[] args) {
		try {
			final String SQL = "select id, name, email, password from users"; // 다 퍼올림

			Class.forName("oracle.jdbc.driver.OracleDriver"); // OJDBC 문서에 해당 드라이버를 로드해라는 메뉴얼이 있음.

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang",
					"c##madang");
			// 스트림 연결

			PreparedStatement pstmt = conn.prepareStatement(SQL);// 버퍼를 달았다.
			// ?를 사용하게 해준다
			// ?를 사용하게 해준다
			// 파싱을 한 번만 함, 인젝션공격을 막아준다
			pstmt.executeQuery(); // 버퍼에 쓰기 - ResultSet을 리턴받음!!
			ResultSet rs = pstmt.executeQuery();
			List<Users> users = new ArrayList<>();
			while (rs.next()) { // if는 안됨 다 퍼올려야하니까
				Users user = new Users(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("password"));

				users.add(user);

			}

			for (Users user : users) {
				System.out.println(user.getId()); // 컬럼명쓰는게 좋음 가독성때문에
				System.out.println(user.getName());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				System.out.println("셀렉트 완료"); // 자바오브젝트로 관리해야 관리쉽다 (오브젝트여러개면 컬렉션) //select 는 execute쓰면된다(변화가 없으니까)
			}

			// delete,update는 excuteUpdate 써서 commit을해야된다 (왜냐하면 변경이 됐으니까 커밋해야함)
		} catch (Exception e) {

			e.printStackTrace();
		}
		// heap에 Oracle Driver 띄운다, static절이 호출된다
		// 드라이버 매니져 클래스가 들고 있는 static들이 뜬다
		// Oracle driver이용해서 stram 연결한다(인터페이스들고있어서)
		// Driver Manager로 get connection쓰면 주소찾아준다 conn => stream
		// 직접 뉴하지않고 class forname으로 하는데 주소를 모르는데 driver manager에 있는 get함수에 호출하면
		// 리턴받으면 stream(통신)된다.
	}

	// 어떻게 드라이버매니져가 오라클 드라이버를 찾는ㄵ지
}

// DB로 문장을 날리면 parser가 compile함

// JDBC는 인터페이스이다 통신을하는데 프로토콜있다

// preparedstatement : 인젝션공격 막음 (or 못들어가게, 주석처리), 방어파싱을 한다

// DBMS에서 resultset 타입을 리턴해줌 resultset 은 커서
// 커서를 리턴해준다 => 레퍼런스주소만 리턴해준다.
// 자바에서 변수rs를 받는다 [결과가 아니라 결과를 가르키는 커서임]
// 제이슨을 리턴받지 않고 커서를 리턴받는다
//
