package SelfStudy;

class Aa {
	static int num2 = 1;
	int num4 = 5;
}

public class SelfStudyEx12 {
	static int num1 = 1;
	int num = 10;

	void hello() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		SelfStudyEx12 d1 = new SelfStudyEx12();
		System.out.println(d1.num);
		// SelfStudyEx12 �ȿ� �ִ� static�ȵ��ִ� num�� ã������
		// new�ؼ� SelfStudyEx12�� d1 heap������ ���� d1.num���� ã�ư�

		System.out.println(SelfStudyEx12.num1); // �̰͵� �����ϰ� �ؿ��͵� �����ϰ�
		System.out.println(num1);

		// �̰Ŵ� Aa��� ���� �ٸ� Ŭ������ ������

		System.out.println(Aa.num2); // num2�� static �����̶� Aa.num2 �Ǵ°���
		Aa d2 = new Aa();
		// System.out.println(Aa.num4); �̷��� �ϸ� �ȵ�
		System.out.println(d2.num4);
		
		// new �ϸ� static�� �ƴѰ͵��� �� ���!
	}

}
