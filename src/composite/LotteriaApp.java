package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		// BigBurgerSet 추가요
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println();

		// Burger 추가요.
		Burger burger1 = new Burger();
		System.out.println();

		// 콜라 추가요.
		Coke coke1 = new Coke();

		// BigBurgerSet 추가요!! 버거 1000원할인 쿠폰
		/*
		 * BigBurgerSet set2 = new BigBurgerSet( new BigBurger(3000, "빅버거할인"), new
		 * Coke(), new FrenchFried()
		 * 
		 * );
		 * 
		 */
		/*
		 * BigBurgerSet set3 = new BigBurgerSet(2000, "빅버거할인"), new BigBurger(2000,
		 * "빅버거할인"), new Coke(), new FrenchFried()
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
