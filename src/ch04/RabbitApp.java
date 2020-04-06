package ch04;

class Rabbit{
	private String name;   //heap 변수, 전역변수, 멤버변수, 필드, 속성, 프로퍼티
	 private int power;
	
	
	
	
	
	//생성자를 통해서 태어남.
	public Rabbit(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	
	
	//행동(책임)
	boolean drink() {
		
		
		if(power ==100) {
			return false;
		}
		power++;
		return true;
		
		//	if(power <= 100) {
	//	System.out.println(power);
	//	}
			
		
		
		
		//100이넘어가면 동작하지 않도록
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
		Rabbit r1 = new Rabbit("토끼", 20); //100이 맥스
		// 이렇게 만드면 안됨 r1.power = 100;
		//r1.drink();
	
		//
		//System.out.println(r1.power);
	
	
		
		//r1.power = 500; //잘못됨 막아야됨
		
		while(r1.drink()) {}
		System.out.println(r1.getPower());
		
		//이름변경
		r1.setName("산토끼");
		System.out.println(r1.getName());
		
	}

}
