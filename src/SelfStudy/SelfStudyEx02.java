package SelfStudy;

import java.util.Scanner;

public class SelfStudyEx02 {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //���ڿ� �б�
		System.out.println("�̸���" +name+ ",");
		
		String city = scanner.next();
		System.out.println("���ô�"+city+ ",");
		
		int age = scanner.nextInt(); //���� �б�
		System.out.println("���̴�" +age+ "��, ");
		
		double weight = scanner.nextDouble(); //�Ǽ� �б�
		System.out.println("ü����  " + weight + "kg,  ");
		
		
		boolean isSingle = scanner.nextBoolean(); //���� �б�
		System.out.println("���� ���δ�" + isSingle+ "�Դϴ�. ");
		scanner.close();  //scanner ��ü �ݱ�
			
		//   69/10    -> �� 6
		//   69%10  ->������ 9
		

	}

}
