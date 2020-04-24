package SelfStudy;

public class SelfStudyEx19 {
//중요한 개념을 깨달음	
//1. new로 띄울때 데이터 타입은 클래스의 주소이다
//2. 인스턴트로 실체화 시켜서 클래스에 있는 변수를 가져오거나 메소드 찾을 수 있음
//3. new를 하면static영역말고 데이터타입설정한 그 클래스에 있는곳에
//heap영역 부분의 (static없는것들)  것이 뜬다
//4. 명심할것: 메소드와 변수는 존재를 의미하지 출력을 의미하지 않는다
//5. 그렇기 때문에 return값의 존재의 이유가 성립한다.
	
	int num = 10;
	static String name = "아이유";
	
	void test() {
		String f = "마마";
		System.out.println(f);
	}
	
	
	
	String test2() {
		String g = "머머";
		return g;
	}
	
	
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum: " + sum);
		SelfStudyEx19 s = new SelfStudyEx19();
		s.test();
		s.test2(); //값만 존재하는 상태 
		System.out.println(s.test2()); //존재하는 값을 출력한다
		
	}

}
