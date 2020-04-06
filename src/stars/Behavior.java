package stars;

import stars.protoss.Dragoon;
import stars.protoss.Zealot;

//추상 클래스와 유사
//추상 메서드만 존재 가능!
//동적 바인딩의 통로로만 사용!   인터페이스: 통로로만 사용   // 추상클래스 : 몸체의 역할가능

public interface Behavior {
	public abstract void move(); // 이동은 다르지않아서 바로 구현

	void repair(); // interface 에서는 public abstract 생략가능

	void attack(Behavior unit); // 공격은 추상화해야함

}
