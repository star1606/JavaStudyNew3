package ch05;




//�߻�Ŭ������ �Ϲ� �޼��带 ���� �� �ִ� 
//�߻�Ŭ������ ���� ������ �� ���� �޼��带 ������Ʈ���� �̷� �� �ִ�
//�߻�Ŭ������ abstract�� ���δ�
//�߻�Ŭ������ ���ؼ� ������ ���� �� �ִ�
abstract class Food { //�Ϲ� �޼��嵵������ �߻�޼��嵵 ������
	
	abstract void stanby();        //�غ����
	
	protected void eat() {
		System.out.println("������ �Խ��ϴ�.");
	}
 abstract void cook();    //protected �ڽĸ� ��밡��

	void auto() {
		stanby();
		cook();
		eat();
	}
	
}

class ��� extends Food {

	@Override
	void cook() {
		System.out.println("���� ���δ�.");
		
	}

	@Override
	void stanby() {
		System.out.println("���� ������ ���� �غ��մϴ�.");
		
	}
	
}

class ���� extends Food {

	@Override
	void cook() {
		 System.out.println("���ǿ� ���´�.");
		
	}

	@Override
	void stanby() {
		System.out.println("���ǰ� ���� ���ʸ� �غ��մϴ�.");
		
	}
	
}
public class FoodEx02 {

	static void start(Food f) {     //static void start(��� f) { --�̰Ű���
//		f.cook();           // f�� ����?
//		f.eat();
		f.auto();               //�̷����ؾ� �Ǽ��� �� �Ѵ� 
	}
		
	
	public static void main(String[] args) {
		start(new ���());

	}

}
