package ch05;

abstract class Food1 {  //abstract해서 Food는 new 못함 object가 아니기때문
	 abstract void eat();	//추상클래스는 추상 메서드를 가질 수 있다
		
	
}

class 라면1 extends Food1 {  //alt + enter 

	String name = "라면1";
	
	@Override
	void eat() {
		System.out.println(name+"을 먹었습니다.");
		
		
	}
	
	
}

class 불고기1 extends Food1 {
	String name = "불고기1";
	@Override
	void eat() {
		System.out.println(name+"을 먹었습니다.");
		
	}
	
	
	
}

class 갈비1 extends Food1 {
	String name = "갈비1";
	@Override
	void eat() {
		System.out.println(name+"를 먹었습니다.");
		
	}
	

}

public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	

	public static void main(String[] args) {
		start(new 라면1());
		start(new 갈비1());
		start(new 불고기1());
	}

}
