package array03;

public class StarEx01 {
	
	
	
//	*
//	**
//	***
//	****
//	
	static	void printStars(int i) {
		for (int j = 0; j < i; j++) {  //���� ����
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		for (int i = 4; i  > 0 ; i--) {
			printStars(i);
			
		}
	
		
		
		
		
		
//		for (int i = 1; i < 5; i++) {//���� ����
//			printStars(i);
//		}
		
//		printStars(1);
//		printStars(1);
//		printStars(1);
//		printStars(1);
//		printStars(1);
//		System.out.println("*"); //1
//		System.out.println("**"); //2
//		System.out.println("***"); //3
//		System.out.println("****"); //4
//		

	}

}
