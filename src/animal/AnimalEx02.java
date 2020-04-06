package animal;
// 추상클래스 - 어댑터역할, 순서역할, 일반 메서드도 가지고

// 인터페이스 - 통로로만 씀 - 인터페이스 : 조종기 하나만 
//인터페이스 특징 1.표준을 만들 수 있음,규칙을 만듬 그걸 맞추게만듬          2.조종기역할, 인터페이스를 통해 쉽게 조종가능

interface Animal { // 구현한다
	void run();

	void sound();
}

class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("강아지 달린다.");

	}

	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}

class Cat implements Animal {

	@Override
	public void run() {
		System.out.println("고양이 달린다.");

	}

	@Override
	public void sound() {
		System.out.println("야옹");

	}

}

class Bird implements Animal {

	@Override
	public void run() {
		System.out.println("새 달린다.");

	}

	@Override
	public void sound() {
		System.out.println("짹짹");

	}

	public void fly() {
		System.out.println("새는 난다.");
	}

	// 인터페이스 없어서 fly 못씀.
}

public class AnimalEx02 {

	static void start(Animal a) {
		a.run();
		a.sound();
		if (a instanceof Bird) {
			((Bird) a).fly();
		}

	}

	public static void main(String[] args) {
		Animal d = new Dog();
		d.run();
		d.sound();

		Animal b = new Bird();
		b.run();
		b.sound();

//	if(b instanceof Bird) {   //b가 birdtype인가?
		// System.out.println("안녕"); //fly 메서드를 가진 놈이라는걸 확신.
		// ((Bird)b).fly();
		start(new Dog());
		start(new Bird());
	}
}
