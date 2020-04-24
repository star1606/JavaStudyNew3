package opentutorials;

public class z1 {
	
	static String first = "coding";
	
	
	static String a = "code";
	static int b = 100;
	
	
	public static void main(String[] args) {
		
		System.out.println(first);
		System.out.println(a);
		System.out.println(100 + 10);
		System.out.println(b + 50);
		
		
		byte num1 = -120;
		System.out.println(num1);
		
		int num2 = 1000000000;
		System.out.println(num2);
		
		long num3 = 10;
		System.out.println(num3);
		
		int n1 = num1;/* 묵시적형변환 */
		/* byte n2 = num2; 오류*/
		byte n3 = (byte)num3; // 명시적 형변환 (자료형을 변환할수있다.) 
		int n4 = (int)num3;

		int n5 = (int)num3;
		

		
		 
		
	}

}
