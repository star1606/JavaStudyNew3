package stars.zerg;

import stars.Behavior;

//@AllArgsConstructor					//������ �ڵ����� ���� static�� �ǵ��� ����.
//@NoArgsConstructor             //�������
//@Data                                        //getter, setter
public class Ultra extends Zerg {
	private String name;
	private int hp;
	public static int attack = 50;

	public Ultra(String name) {

		this.name = name;
		this.hp = 100;

	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("�ٰŸ� ����");

	}

}
