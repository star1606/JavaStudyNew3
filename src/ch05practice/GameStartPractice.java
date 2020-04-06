package ch05practice;

//다크템플러 DarkTempler, 리버 River

abstract class Protoss {
	abstract String getName();        //ctrl + r 찾아서 싹 다 바꾸기;
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack); //getter setter 필요할지
                                                                       //어떤자료형으로 만들지


}

class DarkTempler extends Protoss {   //오류 alt + enter add implement쓰기
	final String NAME;
	int hp;
	static int attack = 50;

	@Override
	String getName() {
		return NAME;
	}	
	
	
	public DarkTempler(String name) {
			
			this.NAME = name;
			this.hp = 100;
			
		
			
	}


	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		
	}


	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	void setAttack(int attack) {
		// TODO Auto-generated method stub
		
	}

}

/*
 * class River extends Protoss {
 * 
 * final String NAME; int hp; static int attack = 70;
 * 
 * public River(String name) {
 * 
 * this.NAME = name; this.hp = 100;
 * 
 * @Override String getName() {
 * 
 * return NAME(); } }
 * 
 * }
 * 
 * class Zealot extends Protoss { final String NAME; int hp; static int attack =
 * 10; // new를 해야지 heap이뜸 new 이후에 건드릴수있음
 * 
 * @Override String getName() { return NAME; }
 * 
 * public Zealot(String name) {
 * 
 * this.NAME = name; this.hp = 100; // 선언할 때 부터 초기화
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * // immutable class Dragoon extends Protoss { // final로 표시 보면 name이 변수로 보이니까
 * 불변데이터 코드 컨벤션. final String NAME; // 한 번 초기화 되서 들어가면 읽을수만있지 수정불가능 변수아님 상수임 int
 * hp; static int attack = 15;
 * 
 * @Override String getName() { return NAME; }
 * 
 * 
 * public Dragoon(String name) {
 * 
 * this.NAME = name; // 값은 생성자 초기화 할때 넣어야함 this.hp = 100;
 * 
 * }
 * 
 * }
 * 
 * //2개의 클래스를 만듬 public class GameStartPractice { // 질럿 => 드라군
 * 
 * // static void attack(Protoss u1, Protoss u2) { // u2.hp = u2.hp - u1.attack;
 * // System.out.println(u2.NAME + "이" +u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // // // //
 * static void attack(Zealot u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이" +u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(Zealot u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이 " +u1.NAME+ "에게공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(Zealot u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이" +u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(Dragoon u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이" +u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // static void
 * attack(Dragoon u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이" +u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(Dragoon u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이" +u1.NAME+"에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // // // //
 * static void attack(Zealot u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이 "+u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(Dragoon u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "이 "+u1.NAME+ "에게공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(DarkTempler u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가 "+u1.NAME+ "에게공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // // static
 * void attack(DarkTempler u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가 "+u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(DarkTempler u1, River u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가"+u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(River u1, DarkTempler u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가"+u1.NAME + "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(River u1, Zealot u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가"+u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } // // static
 * void attack(River u1, Dragoon u2) { // u2.hp = u2.hp - u1.attack; //
 * System.out.println(u2.NAME + "가"+u1.NAME+ "에게 공격당하고 있습니다."); //
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); // } //
 * 
 * static void attack(Protoss u1, Protoss u2) { u2.hp = u2.hp - u1.attack;
 * System.out.println(u2.NAME + "가" + u1.NAME + "에게 공격당하고 있습니다.");
 * System.out.println(u2.NAME + "의 체력은" + u2.hp + "입니다."); }
 * 
 * public static void main(String[] args) { // 인스턴스화 시킴 // 공격력 업그레이드 하기
 * Zealot.attack++;
 * 
 * // 질럿 생성하기 Protoss z1 = new Zealot("1번질럿");
 * System.out.println(Zealot.attack); System.out.println(z1.attack); // 방법이 좋지않다
 * 
 * Protoss z2 = new Zealot("2번질럿"); System.out.println(Zealot.attack);
 * 
 * Protoss d1 = new Dragoon("1번드라군"); System.out.println(Dragoon.attack);
 * 
 * Protoss d2 = new Dragoon("2번드라군"); System.out.println(Dragoon.attack);
 * 
 * Protoss t1 = new DarkTempler("1번 다크템플러");
 * System.out.println(DarkTempler.attack);
 * 
 * Protoss t2 = new DarkTempler("2번 다크템플러");
 * System.out.println(DarkTempler.attack);
 * 
 * Protoss r1 = new River("1번 리버"); System.out.println(River.attack);
 * 
 * Protoss r2 = new River("2번 리버"); System.out.println(River.attack);
 * 
 * // 공격하기
 * 
 * attack(z1, d1); attack(z1, r1); attack(z1, t1); System.out.println();
 * 
 * attack(d1, z1); attack(d1, r1); attack(d1, t1); System.out.println();
 * 
 * attack(r1, z1); attack(r1, d2); attack(r1, t2); System.out.println();
 * 
 * attack(t1, z1); attack(t1, d1); attack(t1, r1); System.out.println();
 * 
 * }
 * 
 * }
 */
//객체가만들어지기전에 static으로 관리해야할 영역이 있다 ex) 포지 공업