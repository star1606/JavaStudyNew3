package ch16;

class MyConnection {
	

}

class MyJDBC extends MyConnection{
	
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("생성자 호출");
	}
	static { //new할때 static 내부가 호출됨 	  //객체를 생성하기전에 초기화하고 싶을 때
		conn = new MyJDBC();
		//System.out.println("static 초기화 호출"); //처음에 띄운다
	}											  //객체 생성시(new) 자동으로 만들어짐
}

public class TestEx01 {

	public static void main(String[] args) {
		//MyJDBC mj = new MyJDBC();
		try {
			Class.forName("ch16.MyJDBC");
			MyConnection conn = MyJDBC.conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		// 데이터베이스 -> 순차적관리
}	    // 드라이버매니저가 오라클과 관련된 힙들을 다 관리한다
		// 오라클드라이버들이 접근하려면 드라이버매니저를 통해서 접근
	 	// Class.forNmae("클래스")하면(static절뜸) 오라클 드라이버뜬다 뜨는데 드라이버매니저(주소가지고있음)가 내부에서 연결시켜준다
		// forName한다음에 드라이버매니저에 접근하기만하면된다 
