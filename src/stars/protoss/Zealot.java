package stars.protoss;

import stars.Behavior;

//@AllArgsConstructor					//������ �ڵ����� ���� static�� �ǵ��� ����.
//@NoArgsConstructor             //�������
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
		System.out.println("�ٰŸ� ����");

	}

}
