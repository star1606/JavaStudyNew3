package stars.protoss;

import stars.Behavior;

//@AllArgsConstructor					//생성자 자동으로 생성 static은 건들지 않음.
//@NoArgsConstructor             //빈생성자
//@Data                                        //getter, setter
public class Dragoon extends Protoss {
	private String name;
	private int hp;
	private int sh;
	public static int attack = 15;

	public Dragoon(String name) {

		this.name = name;
		this.hp = hp;
		this.sh = sh;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("원거리 공격");

	}

}
