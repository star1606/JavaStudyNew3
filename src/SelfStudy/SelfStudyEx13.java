package SelfStudy;

//cal �κ� return�� ������ �� �ִ� �κ�. �Ű������� �����غ���
public class SelfStudyEx13 {

	// 1. ���� �ְ� sysout �� ���� ���
	static int add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("result: " + result); // ������ �� �ʿ�����?
		return result; // �̷��� ����.
	}
	// �Լ��� ���ϰ������� �׳� �Ҹ��� ����ϴ� �κ��� �����ϱ�
	// add(3,5)��� ���� �׳� �����߻� �׷��� return ����

	// 2. ������ �� �ְ� sysout ���� ���
//	static int minus(int m1, int m2) { 
//		int result2 = m1 - m2;
//		System.out.println("result: " + result2);
//		
//	} ����� �ȵ� �ֳ��ϸ� return�������ؼ� �Լ����� �ְ� �޴°�
	//�ȵǴϱ�
	// return�� �Լ����� �ְ� �޴°� sysout ���� ���̰� ����ϴ°�

	
	// 3. ������ �־��� sysout�� �� �������
	static int minus(int m1, int m2) {
		int result2 = m1 - m2;
		return result2;
	}

	
	
	public static void main(String[] args) {
		add(3, 5);
		

		minus(6, 4);    // �Լ��� ���������
		                // sysout�� �����ϱ� ���� �ƹ��͵� �ȳ���
		
		System.out.println(minus(10,5)); // �̷��� �ؾ��� ����
		
		
		
	}

}
