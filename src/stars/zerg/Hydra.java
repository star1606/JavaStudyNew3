package stars.zerg;

import stars.Behavior;

//@AllArgsConstructor					//생성자 자동으로 생성 static은 건들지 않음.
//@NoArgsConstructor             //빈생성자
//@Data                                        //getter, setter
public class Hydra extends Zerg {
	private String name;
	private int hp;
	public static int attack = 20;

	public Hydra(String name) {

		this.name = name;
		this.hp = 100;

	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("원거리 공격");

	}

}
