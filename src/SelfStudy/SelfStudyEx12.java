package SelfStudy;

class Aa {
	static int num2 = 1;
	int num4 = 5;
}

public class SelfStudyEx12 {
	static int num1 = 1;
	int num = 10;

	void hello() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		SelfStudyEx12 d1 = new SelfStudyEx12();
		System.out.println(d1.num);
		// SelfStudyEx12 안에 있는 static안돼있는 num을 찾기위해
		// new해서 SelfStudyEx12의 d1 heap공간을 만들어서 d1.num으로 찾아감

		System.out.println(SelfStudyEx12.num1); // 이것도 가능하고 밑에것도 가능하고
		System.out.println(num1);

		// 이거는 Aa라는 완전 다른 클래스의 영역임

		System.out.println(Aa.num2); // num2는 static 영역이라 Aa.num2 되는거임
		Aa d2 = new Aa();
		// System.out.println(Aa.num4); 이렇게 하면 안됨
		System.out.println(d2.num4);
		
		// new 하면 static이 아닌것들이 다 뜬다!
	}

}
