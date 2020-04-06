package SelfStudy;

// 2020-04-06 월
// 메소드(함수)는 클래스 안에 작성할 수 있다.
// 메서드(함수)는 메서드(함수)안에 작성할 수 없다.



public class SelfStudyEx17 {
	int num = 10;
	static String name = "홍길동";
	
	public int test() {             // void로 했더니 return값이 없어가지고
									// sysout으로 함수 쓰기 불가능 return이용했고
									// 인스턴트 m을 써서 m.test() 을 이용.
		int num = 5;
		return num;
		
	}
	
	
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:" + sum);
		SelfStudyEx17 m = new SelfStudyEx17(); //새로운 걸 끌어올려 heap공간생성
		m.test();   //인스턴스 m을 만들어 test메소드를 사용한 것.
		System.out.println(m.test());
		System.out.println(name);
		System.out.println();
		System.out.println("번호:" + m.num);
		
		System.out.println("프로그램 종료");
		
		

	}

}
