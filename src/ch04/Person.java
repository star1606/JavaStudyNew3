package ch04;




//���¿� �ൿ
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;


	
	public Person(String name, String job, String bloodType) {
		super();
		this.name = name;
		this.job = job;
		this.bloodType = bloodType;
	}


	//����Ʈ ������(�Ű������� ���¾���)  �������ڵ����� �����Ϸ��� �����
	//�ʱ�ȭ
	public Person() {  //Ŭ�����ϰ� �̸��� �Ȱ��� �Լ� ������ (constructor) ������ =�ʱ�ȭ �뵵.
		
		
		
	}


//�Ű����� ������
//�Լ� �̸��� �Ȱ����� �� ����� - �����ε� - �Ű������ִ��Լ��� �����Լ��� �̸������� ������

	public Person(String name, String job, int age, char gender, String bloodType) {
	
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	

}
