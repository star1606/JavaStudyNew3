package array03;

import java.util.Random;
import java.util.Scanner;

public class NumerGuess {

	public static void main(String[] args) {
		int low, high; //ī�忡 ���� ���� ����
		int card; // ī�忡 ���� ��ȣ ��(����� ��, ����)
		Random r = new Random(); // ���� �߻��� ����
		Scanner scanner = new Scanner(System.in); //Ű���� �Է±� ����
		
		
		// "N"�� �Էµ� ������ �ݺ��Ͽ� ������ �����Ѵ�.
		
		while(true) {
			int i = 0; //������� ����Ƚ��
			low = 0; //ī�� ���� �ּ� ����
			high = 99; // ī�� ���� �ִ����
			card = r.nextInt(100); // 0�� 99������ ����(����� ��) ����
			System.out.println("���� �����Ͽ����ϴ�. ���߾����.");
			
			while(true) {
				System.out.println(low + "-" +high);  //���� ���� ���
				System.out.println(i+1+">>");  //����Ƚ�� ���
				int n=0;
			
	
			try {
				n = scanner.nextInt(); //���� �Է¹޴´�.
			}
			catch(Exception e) { //Ű �Է��� ������ ��ȯ���� ���ϴ� ���� ó��
				System.out.println("������ �Է��ϼž� �մϴ�!!");
				scanner.nextLine(); //������ ���Ű�� �о ������.
			}
			
			if(n>high || n<low)  //high�� low�� ������ ��� ���
				System.out.println("������ ������");
			else {
				if(n==card) {
					System.out.println("�¾ҽ��ϴ�");
					break; //while�� ����
				}
				else if(n>card) {
					System.out.println("�� ����");
					high = n;
				}
				else { //�Էµ� ���� ���亸�� ���� ������ ���� ���
					System.out.println("�� ����");
					low = n;
				}
			}
			
		}
		

	}

}
}
