package array03;

import java.util.Scanner;

public class ArrayEx061 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // ���ڿ� ���ڿ��� ���ϸ� ���ڿ��̵ȴ�(������ ����ȯ)
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		
		
		//System.out.println("���� : " + tempNum2.length);
		//System.out.println();

		// �ڸ��� ����� ���� ����
		int p = (tempNum2.length % 3);

		for (int i = 0; i < tempNum2.length; i++) {

			// ù°�ڸ� �տ� ,�� ������ �ȵǴ� ù ��������.
			if (i == 0) {
				tempNum2[i] = "" + tempNum2[i];
			}

			// i�� 3���� ���� ���� p���� ������ �տ� ,�� ����
			else if (i % 3 == p) {
				tempNum2[i] = "," + tempNum2[i];
			}

			// �ڸ��� ��� ���
			System.out.print(tempNum2[i]);
		}
	}
}
