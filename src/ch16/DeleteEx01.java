package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEx01 { 
	//데이터베이스 연결할건데 JDBC드라이버호출할거임

	public static void main(String[] args) {
		try {
			final String SQL = "delete from users where id = ?";
		
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); //OJDBC 문서에 해당 드라이버를 로드해라는 메뉴얼이 있음.
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "c##madang");           
			//스트림 연결
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);//버퍼를 달았다.
			pstmt.setInt(1, 1);													 // ?를 사용하게 해준다
							     // ?를 사용하게 해준다
															     				// 파싱을 한 번만 함, 인젝션공격을 막아준다
			pstmt.executeUpdate(); //버퍼에 쓰기(commit이 있음)
			System.out.println("삭제완료");	//select 는 execute쓰면된다(변화가 없으니까)  
												//delete,update는 excuteUpdate 써서 commit을해야된다 (왜냐하면 변경이 됐으니까 커밋해야함) 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    // heap에 Oracle Driver 띄운다, static절이 호출된다
	    //드라이버 매니져 클래스가 들고 있는 static들이 뜬다
		//Oracle driver이용해서 stram 연결한다(인터페이스들고있어서)
		//Driver Manager로 get connection쓰면 주소찾아준다 conn => stream
		//직접 뉴하지않고 class forname으로 하는데 주소를 모르는데 driver manager에 있는 get함수에 호출하면
		//리턴받으면 stream(통신)된다.
	}  
	
		//어떻게 드라이버매니져가 오라클 드라이버를 찾는ㄵ지
}

		//DB로 문장을 날리면  parser가 compile함

		//JDBC는 인터페이스이다 통신을하는데 프로토콜있다
