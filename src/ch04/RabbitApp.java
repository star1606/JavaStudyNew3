package ch04;

class Rabbit{
	private String name;   //heap ����, ��������, �������, �ʵ�, �Ӽ�, ������Ƽ
	 private int power;
	
	
	
	
	
	//�����ڸ� ���ؼ� �¾.
	public Rabbit(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	
	
	//�ൿ(å��)
	boolean drink() {
		
		
		if(power ==100) {
			return false;
		}
		power++;
		return true;
		
		//	if(power <= 100) {
	//	System.out.println(power);
	//	}
			
		
		
		
		//100�̳Ѿ�� �������� �ʵ���
		//for (int i = 0; i < 100; i++) {
		//	System.out.println(i);
			
		//}
			
	}
	
	
	
	public int getPower() {
		return power;
		
		
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}


public class RabbitApp {
	

	
	
	
	
	
	
	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("�䳢", 20); //100�� �ƽ�
		// �̷��� ����� �ȵ� r1.power = 100;
		//r1.drink();
	
		//
		//System.out.println(r1.power);
	
	
		
		//r1.power = 500; //�߸��� ���ƾߵ�
		
		while(r1.drink()) {}
		System.out.println(r1.getPower());
		
		//�̸�����
		r1.setName("���䳢");
		System.out.println(r1.getName());
		
	}

}
