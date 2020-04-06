package animal;
// �߻�Ŭ���� - ����Ϳ���, ��������, �Ϲ� �޼��嵵 ������

// �������̽� - ��ηθ� �� - �������̽� : ������ �ϳ��� 
//�������̽� Ư¡ 1.ǥ���� ���� �� ����,��Ģ�� ���� �װ� ���߰Ը���          2.�����⿪��, �������̽��� ���� ���� ��������

interface Animal { // �����Ѵ�
	void run();

	void sound();
}

class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("������ �޸���.");

	}

	@Override
	public void sound() {
		System.out.println("�۸�");

	}

}

class Cat implements Animal {

	@Override
	public void run() {
		System.out.println("����� �޸���.");

	}

	@Override
	public void sound() {
		System.out.println("�߿�");

	}

}

class Bird implements Animal {

	@Override
	public void run() {
		System.out.println("�� �޸���.");

	}

	@Override
	public void sound() {
		System.out.println("±±");

	}

	public void fly() {
		System.out.println("���� ����.");
	}

	// �������̽� ��� fly ����.
}

public class AnimalEx02 {

	static void start(Animal a) {
		a.run();
		a.sound();
		if (a instanceof Bird) {
			((Bird) a).fly();
		}

	}

	public static void main(String[] args) {
		Animal d = new Dog();
		d.run();
		d.sound();

		Animal b = new Bird();
		b.run();
		b.sound();

//	if(b instanceof Bird) {   //b�� birdtype�ΰ�?
		// System.out.println("�ȳ�"); //fly �޼��带 ���� ���̶�°� Ȯ��.
		// ((Bird)b).fly();
		start(new Dog());
		start(new Bird());
	}
}
