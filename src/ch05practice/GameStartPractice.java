package ch05practice;

//��ũ���÷� DarkTempler, ���� River

abstract class Protoss {
	abstract String getName();        //ctrl + r ã�Ƽ� �� �� �ٲٱ�;
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack); //getter setter �ʿ�����
                                                                       //��ڷ������� ������


}

class DarkTempler extends Protoss {   //���� alt + enter add implement����
	final String NAME;
	int hp;
	static int attack = 50;

	@Override
	String getName() {
		return NAME;
	}	
	
	
	public DarkTempler(String name) {
			
			this.NAME = name;
			this.hp = 100;
			
		
			
	}


	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		
	}


	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	void setAttack(int attack) {
		// TODO Auto-generated method stub
		
	}

}

/*
 * class River extends Protoss {
 * 
 * final String NAME; int hp; static int attack = 70;
 * 
 * public River(String name) {
 * 
 * this.NAME = name; this.hp = 100;
 * 
 * @Override String getName() {
 * 
 * return NAME(); } }
 * 
 * }
 * 
 * class Zealot extends Protoss { final String NAME; int hp; static int attack =
 * 10; // new�� �ؾ��� heap�̶� new ���Ŀ� �ǵ帱������
 * 
 * @Override String getName() { return NAME; }
 * 
 * public Zealot(String name) {
 * 
 * this.NAME = name; this.hp = 100; // ������ �� ���� �ʱ�ȭ
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * // immutable class Dragoon extends Protoss { // final�� ǥ�� ���� name�� ������ ���̴ϱ�
 * �Һ������� �ڵ� ������. final String NAME; // �� �� �ʱ�ȭ �Ǽ� ���� ������������ �����Ұ��� �����ƴ� ����� int
 * hp; static int attack = 15;
 * 
 * @Override String getName() { return NAME; }
 * 
 * 
 * public Dragoon(String name) {
 * 
 * this.NAME = name; // ���� ������ �ʱ�ȭ �Ҷ� �־���� this.hp = 100;
 * 
 * }
 * 
 * }
 * 
 * //2���� Ŭ������ ���� public class GameStartPractice { // ���� => ���
 * 
 * // static void attack(Protoss u1, Protoss u2) { // u2.hp = u2.hp - u1.attack;
 * // System.out.println(u2.NAME + "��" +u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // // // //
 * static void attack(Zealot u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��" +u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(Zealot u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "�� " +u1.NAME+ "���԰��ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(Zealot u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��" +u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(Dragoon u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��" +u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // static void
 * attack(Dragoon u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��" +u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(Dragoon u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��" +u1.NAME+"���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // // // //
 * static void attack(Zealot u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "�� "+u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(Dragoon u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "�� "+u1.NAME+ "���԰��ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(DarkTempler u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "�� "+u1.NAME+ "���԰��ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // // static
 * void attack(DarkTempler u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "�� "+u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(DarkTempler u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��"+u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(River u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��"+u1.NAME + "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(River u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��"+u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } // // static
 * void attack(River u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "��"+u1.NAME+ "���� ���ݴ��ϰ� �ֽ��ϴ�."); //
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); // } //
 * 
 * static void attack(Protoss u1, Protoss u2) { u2.hp = u2.hp - u1.attack;
 * System.out.println(u2.NAME + "��" + u1.NAME + "���� ���ݴ��ϰ� �ֽ��ϴ�.");
 * System.out.println(u2.NAME + "�� ü����" + u2.hp + "�Դϴ�."); }
 * 
 * public static void main(String[] args) { // �ν��Ͻ�ȭ ��Ŵ // ���ݷ� ���׷��̵� �ϱ�
 * Zealot.attack++;
 * 
 * // ���� �����ϱ� Protoss z1 = new Zealot("1������");
 * System.out.println(Zealot.attack); System.out.println(z1.attack); // ����� �����ʴ�
 * 
 * Protoss z2 = new Zealot("2������"); System.out.println(Zealot.attack);
 * 
 * Protoss d1 = new Dragoon("1�����"); System.out.println(Dragoon.attack);
 * 
 * Protoss d2 = new Dragoon("2�����"); System.out.println(Dragoon.attack);
 * 
 * Protoss t1 = new DarkTempler("1�� ��ũ���÷�");
 * System.out.println(DarkTempler.attack);
 * 
 * Protoss t2 = new DarkTempler("2�� ��ũ���÷�");
 * System.out.println(DarkTempler.attack);
 * 
 * Protoss r1 = new River("1�� ����"); System.out.println(River.attack);
 * 
 * Protoss r2 = new River("2�� ����"); System.out.println(River.attack);
 * 
 * // �����ϱ�
 * 
 * attack(z1, d1); attack(z1, r1); attack(z1, t1); System.out.println();
 * 
 * attack(d1, z1); attack(d1, r1); attack(d1, t1); System.out.println();
 * 
 * attack(r1, z1); attack(r1, d2); attack(r1, t2); System.out.println();
 * 
 * attack(t1, z1); attack(t1, d1); attack(t1, r1); System.out.println();
 * 
 * }
 * 
 * }
 */
//��ü��������������� static���� �����ؾ��� ������ �ִ� ex) ���� ����