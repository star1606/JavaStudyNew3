package stars.protoss;

import stars.Behavior;

public abstract class Protoss implements Behavior {

	@Override
	public void move() {
		System.out.println("�̵�");

	}

	@Override
	public void repair() {
		System.out.println("���� ġ��");

	}

	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}

	// public void move() {
//		System.out.println("�̵�");          //�̵��� �ٸ����ʾƼ� �ٷ� ����
//	}
//	public void repair() {
//		System.out.println("���� ġ��");
//	}
//	
//	// public abstract void attack();           //������ �߻�ȭ�ؾ���
//	
//	public static void upgrade() {            //new �ϱ����� �����ؾ���
//			Zealot.attack++;
//			Dragoon.attack++;	
//	}

}
