package chat;

interface StarUnit{  //Ÿ���� ���� ��Ÿ����Ÿ����..............
	
}

abstract class Protoss implements StarUnit {
	abstract int getSh();
	abstract int getHp();
	
}


abstract class Zerg implements StarUnit {}


class Zealot extends Protoss {   //finally�� ������ ������
	int sh = 100;
	int hp = 100;
	@Override
	int getHp() {
		
		return hp;
	}
	
	@Override
	public int getSh() {
		
		return sh;
	}
}


class Ultra extends Zerg {
	int hp = 100;
	
	
}




public class FinallyEx01 {
	//����üũ, (hp, sh)
	static void check(StarUnit unit) {
		//get shield�� ��ã�´� starunit Ÿ���̶� protoss Ÿ���̾ƴ� 
		try {
			Zealot z = (Zealot) unit;
			System.out.println("���������:" + z.getSh());
		} catch (Exception e) {
			System.out.println("���״� ���尡 �����ϴ�.");
		}
		
		
	}
	
	public static void main(String[] args) {
		check(new Zealot());
		check(new Ultra());
	}

}
