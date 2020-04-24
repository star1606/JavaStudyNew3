package ch13;


//규약!! 
interface Animal {  //interface 앞에 public sbstract 생략되있음. (추상메서드생긴다는소리)
	void move(); //추상 메서드
}

abstract class Person{
	abstract void eat();
}


public class AnomyEx01 {

	public static void main(String[] args) {
		// Aniaml a = new Animal();  => new를 못한다. 왜냐하면 Animal 추상메서드가 있어서
		//그래서 추상메서드를 구현시켜놔야한다.
		
		// Person p = new Person(); => 추상메소드가 구현되지않아서 new할 수 없다
		// Person p2 = new Person(); => 추상클래스는 추상메소드가 들어가 있을 수 있기 때문에 new막아둠 
		
		
		 
	}

}
