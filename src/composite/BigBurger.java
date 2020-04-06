package composite;

public class BigBurger extends Burger { // 빅버거 상속 왜냐하면 버거 속성가지고있으니까

	public BigBurger() {
		super(4000, "빅버거");
	}

	public BigBurger(int price, String desc) {
		super(price, desc);

	}

}
