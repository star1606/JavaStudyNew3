package stars.protoss;

import stars.Behavior;

//@AllArgsConstructor					//생성자 자동으로 생성 static은 건들지 않음.
//@NoArgsConstructor             //빈생성자
//@Data                                        //getter, setter
public class Zealot extends Protoss {
	private String name;
	private int hp;
	private int sh;
	public static int attack = 10;

	public Zealot(String name) {

		this.name = name;
		this.hp = 100;
		this.sh = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("근거리 공격");

	}

}
