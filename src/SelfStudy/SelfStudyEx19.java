package SelfStudy;

public class SelfStudyEx19 {
//�߿��� ������ ������	
//1. new�� ��ﶧ ������ Ÿ���� Ŭ������ �ּ��̴�
//2. �ν���Ʈ�� ��üȭ ���Ѽ� Ŭ������ �ִ� ������ �������ų� �޼ҵ� ã�� �� ����
//3. new�� �ϸ�static�������� ������Ÿ�Լ����� �� Ŭ������ �ִ°���
//heap���� �κ��� (static���°͵�)  ���� ���
//4. ����Ұ�: �޼ҵ�� ������ ���縦 �ǹ����� ����� �ǹ����� �ʴ´�
//5. �׷��� ������ return���� ������ ������ �����Ѵ�.
	
	int num = 10;
	static String name = "������";
	
	void test() {
		String f = "����";
		System.out.println(f);
	}
	
	
	
	String test2() {
		String g = "�Ӹ�";
		return g;
	}
	
	
	public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum: " + sum);
		SelfStudyEx19 s = new SelfStudyEx19();
		s.test();
		s.test2(); //���� �����ϴ� ���� 
		System.out.println(s.test2()); //�����ϴ� ���� ����Ѵ�
		
	}

}
