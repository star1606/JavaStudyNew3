package stars;

import stars.protoss.Dragoon;
import stars.protoss.Protoss;
import stars.protoss.Zealot;
import stars.terran.Tank;
import stars.zerg.Ultra;

public class StartGame {

	public static void attack(Behavior b1, Behavior b2) {
		// b.move();
//		b.repair();
		// b.attack(unit);
		b1.attack(b2);
	}

	public static void repair(Behavior b) {
		b.repair();

	}

	public static void move(Behavior b) {
		b.move();

	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		Ultra u1 = new Ultra("울트라1");

		attack(z1, u1);
		attack(d1, u1);
		move(u1);
		move(d1);
		move(z1);
		repair(z1);
		// move(z1);
		attack(z1, d1);
	}

}
