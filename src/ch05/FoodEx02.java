package ch05;




//추상클래스는 일반 메서드를 가질 수 있다 
//추상클래스는 내가 구현할 수 없는 메서드를 오브젝트에게 미룰 수 있다
//추상클래스는 abstract를 붙인다
//추상클래스를 통해서 순서를 정할 수 있다
abstract class Food { //일반 메서드도가지고 추상메서드도 가지고
	
	abstract void stanby();        //준비재료
	
	protected void eat() {
		System.out.println("음식을 먹습니다.");
	}
 abstract void cook();    //protected 자식만 사용가능

	void auto() {
		stanby();
		cook();
		eat();
	}
	
}

class 라면 extends Food {

	@Override
	void cook() {
		System.out.println("냄비에 끓인다.");
		
	}

	@Override
	void stanby() {
		System.out.println("라면과 가스와 냄비를 준비합니다.");
		
	}
	
}

class 삽겹살 extends Food {

	@Override
	void cook() {
		 System.out.println("불판에 굽는다.");
		
	}

	@Override
	void stanby() {
		System.out.println("불판과 고기와 버너를 준비합니다.");
		
	}
	
}
public class FoodEx02 {

	static void start(Food f) {     //static void start(라면 f) { --이거가능
//		f.cook();           // f가 뭐지?
//		f.eat();
		f.auto();               //이렇게해야 실수를 안 한다 
	}
		
	
	public static void main(String[] args) {
		start(new 라면());

	}

}
