
package stars.terran;

import stars.Behavior;

//@AllArgsConstructor					//������ �ڵ����� ���� static�� �ǵ��� ����.
//@NoArgsConstructor             //�������
//@Data                                        //getter, setter
public class Tank extends Terran {
	private String name;
	private int hp;
	public static int attack = 30;

	public Tank(String name) {

		this.name = name;
		this.hp = 100;

	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("���Ÿ� ����");

	}
}
