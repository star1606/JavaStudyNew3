package ch13;


class Car{
	void run() {
		System.out.println("자동차는 달린다.");
	}
}

class Sonata extends Car{  //메소드 재정의 할필요없고 그대로다
	
	
	
}



class Granger extends Car{
	@Override
	void run() {
		
		super.run();
	}
}

public class AnomyEx03 {
	
	static void start(Car c) {
		c.run();
	
	}

	public static void main(String[] args) {
		start(new Sonata());
		
		

	}

}
