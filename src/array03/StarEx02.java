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
		
		
		
		
//		System.out.println("___*"); // ���� 3�� ��1��
//		System.out.println("__**"); // ���� 2�� ��2��
//		System.out.println("_***"); // ���� 1�� ��3��
//		System.out.println("****"); // ���� 0�� ��4��

	}

}
