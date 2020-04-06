package ch03;

public class CalStudy {

	static int add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("result: " + result);
		return result; // return은 가장 마지막에!!!
	}

	static int minus(int m1, int m2) {
		int result2 = m1 - m2;
		return result2; // System.out.println(); 를 써서 출력한다
	}

	public static void main(String[] args) {

		add(6, 4);
		minus(6, 4);

	}

}
