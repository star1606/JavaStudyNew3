package ch05;

class Car{                     //������ �ƴ϶� �޼��带 ������.
	void run() {
		System.out.println("�⺻ ������");
	}
	
}

class Sonata extends Car{
	
	void run() {
	
		
		System.out.println("�ҳ�Ÿ���� ������");
	}
}

public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();
		s1.run();

	}

}
