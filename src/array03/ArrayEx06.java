package array03;

import java.util.Scanner;

//숫자 10억을 입력받고
//3자리 마다 콤마를 찍어서 출력!! 1,000,000,000

public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // 숫자에 +""하면 문자로 바뀜 묵시적 형변환
		String tempNum2[] = tempNum.split("");
		 
			int len = tempNum2.length; // len = 4
			
			for(int i=0; i<len; i++) {
				if((len-i)%3==0 && i != 0) { //4%3, 3%3, 2%3, 1%3
					System.out.println(",");
						}
				System.out.println(tempNum2[i]);
			}
				
				
			
			
		
		
							//tempNum2.length = 3  1번찍고
							//tempNum2.length = 6  1번찍고
							//tempNum2.length = 9  1번찍고
			//	if(tempNum2.length%3==0) { 
			//		System.out.println(',');
					
			//	}
								

		
		// a-b-c
		// abc

		
		//System.out.println(tempNum2[0]);  
		//System.out.println("길이:" + tempNum2.length);

	}

}
