package ch05;

abstract class Food1 {  //abstract�ؼ� Food�� new ���� object�� �ƴϱ⶧��
	 abstract void eat();	//�߻�Ŭ������ �߻� �޼��带 ���� �� �ִ�
		
	
}

class ���1 extends Food1 {  //alt + enter 

	String name = "���1";
	
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
		
	}
	
	
}

class �Ұ��1 extends Food1 {
	String name = "�Ұ��1";
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
	}
	
	
	
}

class ����1 extends Food1 {
	String name = "����1";
	@Override
	void eat() {
		System.out.println(name+"�� �Ծ����ϴ�.");
		
	}
	

}

public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	

	public static void main(String[] args) {
		start(new ���1());
		start(new ����1());
		start(new �Ұ��1());
	}

}
