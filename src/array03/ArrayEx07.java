package array03;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("6�ڸ� ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt(); //6�ڸ��� �Է�
		
		
		String strNum = num+"";
		System.out.println(strNum.charAt(0));
		System.out.println(strNum.length());
		
		
		int len = strNum.length();
		boolean check = false;
		
		for (int i = 0; i < len; i++) {
			if(strNum.charAt(i) =='3') {
				check = true;
			}
	    //  ȭ����!!!
		}
		
		if(check) {
			System.out.println("3������");
		}else {
			System.out.println("3������X");
		}
		
		/*
		 * for (int i = 1; i<strNum.length() ; i++) {
		 * 
		 * if(strNum.charAt(i)==3) { System.out.println("3�� ã�ҽ��ϴ�."); }else {
		 * System.out.println("3�� �����ϴ�."); } }
		 */
			
		
		
	}

}
