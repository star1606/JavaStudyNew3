package ch03;

//�޼���(�Լ�)�� Ŭ�����ȿ� �ۼ��� �� �ִ�.
//�޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.
public class Mem {
	int num = 10;
	static String name = "ȫ�浿";

	int test() {
		int num = 5;
		return num;
	}

	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:" + sum);
		Mem m = new Mem(); // ���ο�ɲ���ø�
		System.out.println(m.test());
		System.out.println(name);		
		

		System.out.println("��ȣ:" + m.num);
		

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
