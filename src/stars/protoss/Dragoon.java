package stars.protoss;

import stars.Behavior;

//@AllArgsConstructor					//������ �ڵ����� ���� static�� �ǵ��� ����.
//@NoArgsConstructor             //�������
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
		System.out.println("���Ÿ� ����");

	}

}
