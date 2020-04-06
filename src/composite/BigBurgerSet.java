package composite;

import lombok.Data;

//자바는 다중 상속이 안됨
@Data
public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchFried;

	/*
	 * public BigBurgerSet() { this( new BigBurger(), new Coke(), new FrenchFried()
	 */
	/*
	 * ); public BigBurgerSet(BigBurger bigburger, Coke coke, FrenchFried
	 * frenchFried) { this(BigBurger(2000, "빅버거할인"),
	 * 
	 * 
	 * );
	 * 
	 * 
	 */
}

/*
 * //생성자 public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFried
 * frenchFried) { super(); this.bigBurger = bigBurger; this.coke = coke;
 * this.frenchFried = frenchFried; }
 */

// }
