package ch05practice;

//�߻�Ŭ���� new ����
abstract class Animal {// ��ü���� ���̶� �߻����ΰ��� ���� �������̵带 ����

	abstract String name(); // {// �߻� �޼ҵ�
//		return null;
//	}
}

class Dog extends Animal { 
	
	final String NAME = "������";

	@Override// �������� �ο�
	String name() {
		return NAME;
	}

}

class Cat extends Animal {
	final String NAME = "�����";

	@Override
	String name() {
		return NAME;
	}
}

class Bird extends Animal {
	final String NAME = "��";

	@Override // �������� �ο�
	String name() {
		return NAME;

	}

}

class Tiger extends Animal {
	final String NAME = "ȣ����";

	@Override
	String name() {
		return NAME;
	}

}

//�߻����� ���� ��� �ֱ� ������ override �ʼ�
class Mouse extends Animal {
	@Override
	String name() {

		return null;
	}
}

public class AnimalEx01 {
//	static void attack(Dog u1, Cat u2) {
//		System.out.println(u2.NAME + "��" + u1.NAME + "���� ���ݴ��߽��ϴ�.");
//	}
//
//	static void attack(Dog u1, Bird u2) {
//		System.out.println(u2.NAME + "��" + u1.NAME + "���� ���ݴ��߽��ϴ�.");
//	}
//
//	static void attack(Cat u1, Bird u2) {
//		System.out.println(u2.NAME + "��" + u1.NAME + "���� ���ݴ��߽��ϴ�.");
//	}

	static void attack(Animal u1, Animal u2) {
		System.out.println(u2.name() + "��" + u1.name() + "���� ���ݴ��߽��ϴ�.");
	}

	public static void main(String[] args) {
		Animal d1 = new Dog(); // Dog�� Animal�� �޸𸮿� ��
		Animal c1 = new Cat(); // Cat�� Animal�� �޸𸮿� ��
		Animal b1 = new Bird(); // Bird�� Animal�� �޸𸮿� ��
		Animal t1 = new Tiger(); // Bird�� Animal�� �޸𸮿� ��

//		System.out.println(d1.NAME + "ź��");
//		System.out.println(c1.NAME + "ź��");
//		System.out.println(b1.NAME + "ź��");

		// ������ VS �����
		attack(d1, c1);

		// ������ VS ��
		attack(d1, b1);

		// ����� VS ��
		attack(c1, b1);

		// ȣ���� VS �����
		attack(t1, c1);
	}

}