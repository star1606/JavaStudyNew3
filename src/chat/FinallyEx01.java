package chat;

interface StarUnit{  //타입이 전부 스타유닛타입임..............
	
}

abstract class Protoss implements StarUnit {
	abstract int getSh();
	abstract int getHp();
	
}


abstract class Zerg implements StarUnit {}


class Zealot extends Protoss {   //finally는 무조건 실행함
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
	//상태체크, (hp, sh)
	static void check(StarUnit unit) {
		//get shield를 못찾는다 starunit 타입이라서 protoss 타입이아님 
		try {
			Zealot z = (Zealot) unit;
			System.out.println("남은쉴드는:" + z.getSh());
		} catch (Exception e) {
			System.out.println("저그는 쉴드가 없습니다.");
		}
		
		
	}
	
	public static void main(String[] args) {
		check(new Zealot());
		check(new Ultra());
	}

}
