package stars.terran;

import stars.terran.Tank;
import stars.Behavior;
import stars.protoss.Dragoon;
import stars.protoss.Zealot;
import stars.terran.Marine;

public abstract class Terran implements Behavior {
	@Override
	public void move() {
		System.out.println("이동");

	}

	@Override
	public void repair() {
		System.out.println("SCV 치료");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("테란 업그레이드 완료");
	}

}
