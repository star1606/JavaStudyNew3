package array03;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class Gugudan2 {

	// ����ڷκ��� �Է� ���� ������ ���α׷��� �ϼ�!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�.");
		boolean confirm = true;
		while (confirm) {
			System.out.println("���ڸ� �Է��ϼ��� 2~9");
			int num = sc.nextInt();

			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			} // end of for
			System.out.println("��� �����ұ��? y or n");
			String check = sc.next();
			if (check.equals("n")) {
				//break; // ���� ����� �ݺ����� �������� �� ���.
				confirm = false;
				
			}
		} // end of while

		System.out.println("������ ���α׷� ����.");
		// ���߿� ȥ�� �ٽ� �����غ���

	} // end of main

} // end of clas
