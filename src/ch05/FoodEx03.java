package ch05;
//추상클래스는 어댑터의 용도로 사용 가능하다.
abstract class 칼{
	abstract void kill();
	abstract void cook();
	abstract void repair();
}

abstract class 요리사어댑터 extends 칼 { //abstract써서 구현을 미룰 수 있다.
	@Override
	void kill() {	}
	@Override
	void repair() {} //어댑터 : 걸러내는 용도.
	
}


class 백종원 extends 요리사어댑터 {

	@Override
	void cook() {
		// TODO Auto-generated method stub
		
	}

	
	
}


public class FoodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
