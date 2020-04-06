package stars.protoss;

import stars.Behavior;

public abstract class Protoss implements Behavior {

	@Override
	public void move() {
		System.out.println("이동");

	}

	@Override
	public void repair() {
		System.out.println("쉴드 치료");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("프로토스 업그레이드 완료");
	}

	// public void move() {
//		System.out.println("이동");          //이동은 다르지않아서 바로 구현
//	}
//	public void repair() {
//		System.out.println("쉴드 치료");
//	}
//	
//	// public abstract void attack();           //공격은 추상화해야함
//	
//	public static void upgrade() {            //new 하기전에 가능해야함
//			Zealot.attack++;
//			Dragoon.attack++;	
//	}

}
