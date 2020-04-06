package array03;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 숫자를 입력하세요.");
		int num = sc.nextInt(); //6자리수 입력
		
		
		String strNum = num+"";
		System.out.println(strNum.charAt(0));
		System.out.println(strNum.length());
		
		
		int len = strNum.length();
		boolean check = false;
		
		for (int i = 0; i < len; i++) {
			if(strNum.charAt(i) =='3') {
				check = true;
			}
	    //  화이팅!!!
		}
		
		if(check) {
			System.out.println("3이존재");
		}else {
			System.out.println("3이존재X");
		}
		
		/*
		 * for (int i = 1; i<strNum.length() ; i++) {
		 * 
		 * if(strNum.charAt(i)==3) { System.out.println("3을 찾았습니다."); }else {
		 * System.out.println("3이 없습니다."); } }
		 */
			
		
		
	}

}
