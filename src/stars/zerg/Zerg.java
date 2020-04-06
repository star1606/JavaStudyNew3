package stars.zerg;

import stars.Behavior;
import stars.protoss.Dragoon;
import stars.protoss.Zealot;
import stars.zerg.Hydra;
import stars.zerg.Ultra;

public abstract class Zerg implements Behavior {
	@Override
	public void move() {
		System.out.println("�̵�");

	}

	@Override
	public void repair() {
		System.out.println("�ڿ� ġ��");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}

}
