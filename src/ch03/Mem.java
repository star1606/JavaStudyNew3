package ch03;

//�޼���(�Լ�)�� Ŭ�����ȿ� �ۼ��� �� �ִ�.
//�޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.
public class Mem {
	int num = 10;
	static String name = "ȫ�浿";

	void test() {
		int num = 5;
	}

	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:" + sum);
		Mem m = new Mem(); // ���ο�ɲ���ø�
		m.test();

		System.out.println("��ȣ:" + m.num);
		System.out.println(1);
		System.out.println(2);
		System.out.println("���α׷� ����");

		/*
		 * int num = Cal.add(5, 3); System.out.println("��� :" + num);
		 * 
		 * int num2 = Cal.minus(3, 4); System.out.println("��� :" + num2);
		 * 
		 * int num3 =Cal.multi(2, 5); System.out.println("��� :" + num3);
		 * 
		 * int num4 = Cal.divide(6, 3); System.out.println("��� :" + num4);
		 */

	}

}
