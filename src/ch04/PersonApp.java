package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();  //�ν��Ͻ�ȭ �Ѱ�
		p1.name = "�ֽ���";               //�̷��� ¥�� �ȵ� ������ ���̷�Ʈ�� �����ؼ� �ϸ� �ȵ�
														//�ൿ�� ���ؼ� ������ ��ȭ���Ѿ���
		p1.job = "�ǻ�";
		p1.gender = '��';
		p1.bloodType = "AB";
		p1.age = 45;
		
		
		Person p2 = new Person();
		p2.name = "�̹̳�";
		p2.job = "��������";
		p2.gender = '��';
		p2.bloodType = "O";
		p2.age = 28;
		
		Person p3 = new Person();
		p3.name = "��̳�";
		p3.job = "����";
		p3.gender = '��';
		p3.bloodType = "AB";
		p3.age = 47;
		
		
		System.out.println(p3.name);
		System.out.println(p3.job);
		System.out.println(p3.gender);
		System.out.println(p3.bloodType);
		System.out.println(p3.age);
		
		Person p4 = new Person(
				"����ȣ", 
				"����",
				10,
				'��',
				"B"
				//�����ڿ��� �ʱ�ȭ...
		);
		
		
		
		
		System.out.println(p4); // ����̻��ϰԵ�
		System.out.println(p4.name);
		System.out.println(p4.job);
		System.out.println(p4.age);
		System.out.println(p4.gender);
		System.out.println(p4.bloodType);

	} // end of main()

}//end of class
 