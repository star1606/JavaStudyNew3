package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		// BigBurgerSet �߰���
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println();

		// Burger �߰���.
		Burger burger1 = new Burger();
		System.out.println();

		// �ݶ� �߰���.
		Coke coke1 = new Coke();

		// BigBurgerSet �߰���!! ���� 1000������ ����
		/*
		 * BigBurgerSet set2 = new BigBurgerSet( new BigBurger(3000, "���������"), new
		 * Coke(), new FrenchFried()
		 * 
		 * );
		 * 
		 */
		/*
		 * BigBurgerSet set3 = new BigBurgerSet(2000, "���������"), new BigBurger(2000,
		 * "���������"), new Coke(), new FrenchFried()
		 * 
		 * );
		 */

		/*
		 * System.out.println(set1.getBigBurger().getPrice());
		 * System.out.println(set2.getBigBurger().getPrice());
		 * 
		 * 
		 */}
}
