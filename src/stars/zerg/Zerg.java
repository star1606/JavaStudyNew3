package stars.zerg;

import stars.Behavior;
import stars.protoss.Dragoon;
import stars.protoss.Zealot;
import stars.zerg.Hydra;
import stars.zerg.Ultra;

public abstract class Zerg implements Behavior {
	@Override
	public void move() {
		System.out.println("이동");

	}

	@Override
	public void repair() {
		System.out.println("자연 치료");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("프로토스 업그레이드 완료");
	}

}
