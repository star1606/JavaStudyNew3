package array03;

import java.util.Scanner;

//���� 10���� �Է¹ް�
//3�ڸ� ���� �޸��� �� ���!! 1,000,000,000

public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // ���ڿ� +""�ϸ� ���ڷ� �ٲ� ������ ����ȯ
		String tempNum2[] = tempNum.split("");
		 
			int len = tempNum2.length; // len = 4
			
			for(int i=0; i<len; i++) {
				if((len-i)%3==0 && i != 0) { //4%3, 3%3, 2%3, 1%3
					System.out.println(",");
						}
				System.out.println(tempNum2[i]);
			}
				
				
			
			
		
		
							//tempNum2.length = 3  1�����
							//tempNum2.length = 6  1�����
							//tempNum2.length = 9  1�����
			//	if(tempNum2.length%3==0) { 
			//		System.out.println(',');
					
			//	}
								

		
		// a-b-c
		// abc

		
		//System.out.println(tempNum2[0]);  
		//System.out.println("����:" + tempNum2.length);

	}

}
