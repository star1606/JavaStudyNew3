package SelfStudy;

// 2020-04-06 ��
// �޼ҵ�(�Լ�)�� Ŭ���� �ȿ� �ۼ��� �� �ִ�.
// �޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����.



public class SelfStudyEx17 {
	int num = 10;
	static String name = "ȫ�浿";
	
	public int test() {             // void�� �ߴ��� return���� �������
									// sysout���� �Լ� ���� �Ұ��� return�̿��߰�
									// �ν���Ʈ m�� �Ἥ m.test() �� �̿�.
		int num = 5;
		return num;
		
	}
	
	
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:" + sum);
		SelfStudyEx17 m = new SelfStudyEx17(); //���ο� �� ����÷� heap��������
		m.test();   //�ν��Ͻ� m�� ����� test�޼ҵ带 ����� ��.
		System.out.println(m.test());
		System.out.println(name);
		System.out.println();
		System.out.println("��ȣ:" + m.num);
		
		System.out.println("���α׷� ����");
		
		

	}

}
