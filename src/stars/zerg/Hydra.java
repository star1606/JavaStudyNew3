package stars.zerg;

import stars.Behavior;

//@AllArgsConstructor					//������ �ڵ����� ���� static�� �ǵ��� ����.
//@NoArgsConstructor             //�������
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
		System.out.println("���Ÿ� ����");

	}

}
