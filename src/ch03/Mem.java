package ch03;

//메서드(함수)는 클래스안에 작성할 수 있다.
//메서드(함수)는 메서드(함수)안에 작성할 수 없다.
public class Mem {
	int num = 10;
	static String name = "홍길동";

	int test() {
		int num = 5;
		return num;
	}

	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:" + sum);
		Mem m = new Mem(); // 새로운걸끌어올림
		System.out.println(m.test());
		System.out.println(name);		
		

		System.out.println("번호:" + m.num);
		

		/*
		 * int num = Cal.add(5, 3); System.out.println("결과 :" + num);
		 * 
		 * int num2 = Cal.minus(3, 4); System.out.println("결과 :" + num2);
		 * 
		 * int num3 =Cal.multi(2, 5); System.out.println("결과 :" + num3);
		 * 
		 * int num4 = Cal.divide(6, 3); System.out.println("결과 :" + num4);
		 */

	}

}
