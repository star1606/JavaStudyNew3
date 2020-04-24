package ch13;

abstract class Ani {
	abstract void sound(); 
		//System.out.println("?");  //���� �Ҹ���������
	
}


class Cat extends Ani{
	@Override
	void sound() {
		System.out.println("�߿�");
		
	}
	
}


class Bird extends Ani{
	@Override
	void sound() {
		System.out.println("±±");
	}
	
}

class Fish extends Ani{
	@Override
	void sound() {
		System.out.println("����");
		
	}
}


public class AnomyEx04 {
	static void start(Ani a) {
		a.sound();
	}
	
	
	public static void main(String[] args) {
		start(new Cat());  //�� ���� �ϰ� ���� ���� ���� Ŭ�������� �ʿ��������
		start(new Fish()); //�� �� �͸�Ŭ���� ���
		
		
		
		start(new Ani() {
			
			@Override
			void sound() {
				System.out.println("����");
				
			}
		});
	}

}
