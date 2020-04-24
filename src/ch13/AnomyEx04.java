package ch13;

abstract class Ani {
	abstract void sound(); 
		//System.out.println("?");  //무슨 소리내는지모름
	
}


class Cat extends Ani{
	@Override
	void sound() {
		System.out.println("야옹");
		
	}
	
}


class Bird extends Ani{
	@Override
	void sound() {
		System.out.println("짹짹");
	}
	
}

class Fish extends Ani{
	@Override
	void sound() {
		System.out.println("뻐끔");
		
	}
}


public class AnomyEx04 {
	static void start(Ani a) {
		a.sound();
	}
	
	
	public static void main(String[] args) {
		start(new Cat());  //한 번만 하고 끝낼 것을 굳이 클래스만들 필요없게하자
		start(new Fish()); //그 때 익명클래스 사용
		
		
		
		start(new Ani() {
			
			@Override
			void sound() {
				System.out.println("음메");
				
			}
		});
	}

}
