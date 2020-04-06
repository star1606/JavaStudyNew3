package stars.terran;

import stars.terran.Tank;
import stars.Behavior;
import stars.protoss.Dragoon;
import stars.protoss.Zealot;
import stars.terran.Marine;

public abstract class Terran implements Behavior {
	@Override
	public void move() {
		System.out.println("�̵�");

	}

	@Override
	public void repair() {
		System.out.println("SCV ġ��");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�׶� ���׷��̵� �Ϸ�");
	}

}
