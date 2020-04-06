package array03;

public class ArrayEx01 {

	public static void main(String[] args) {

		int num = 1;
		for (long i = 2L; i <= 200000000000000000L; i = i * 2) {
			System.out.println("2ÀÇ" + num + "½Â:" + i);
			num++;
		}

		int num2 = 1;
		for (long j = 10L; j < 200000000000000000L; j = j * 10) {
			System.out.println("10ÀÇ" + num2 + "½Â:" + j);
			num2++;

		}
		
		int num3 = 1;
		for (int i = 2; i < 1000; i=i*2) {
			System.out.println("2ÀÇ" + num3 + "½Â:" + i );
			num3++;
		}
		
		
		/*
		 * int num3 = 4; for (int i = 0; i < 5; i++) { 
		 * System.out.println(num3);	
		 * }
		 * 	 * 
		 * 
		 */
		// while(true) {
		// System.out.println(2);
//		}
	}

}
