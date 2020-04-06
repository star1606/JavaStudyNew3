package array03;

public class StarEx02 {

	static void printStarts(int i) {
	
			if (i == 1) {
				for (int j = 0; j < 4-i ; j++) {
					System.out.println("_");
			
			}
				for (int j = 0; j < i; j++) {
					System.out.println("*");
					
				}
				
				
				System.out.print("___");
				System.out.println("*");
				System.out.println();
			}
			if (i == 2) {
				System.out.print("__");
				System.out.println("**");
				System.out.println();
			}
			if (i == 3) {
				System.out.print("_");
				System.out.println("***");
				System.out.println();
			}
			if (i == 4) {
				System.out.print("");
				System.out.println("****");
				System.out.println();
			}
		
	}

	public static void main(String[] args) {
		
		printStarts(1);
		printStarts(2);
		printStarts(3);
		printStarts(4);
		
		
		
		
//		System.out.println("___*"); // 공백 3개 별1개
//		System.out.println("__**"); // 공백 2개 별2개
//		System.out.println("_***"); // 공백 1개 별3개
//		System.out.println("****"); // 공백 0개 별4개

	}

}
