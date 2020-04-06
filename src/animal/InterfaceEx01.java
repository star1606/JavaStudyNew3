package animal;

//Interface 특징
//1. 변수 : public static final 생략
//2. 함수: public abstract 생략
//3. 통로의 역할을 함 - 동적바인딩
//4. 무조건 추상 메서드만 존재가능 = 강제성을 부여
//5. new 할 수 없다. (자식을 new해서 같이 뛰우는 방법 밖에 없다!)
//6. 공통코드로 사용가능 = 도메인을 준다
interface Cal {
	int num = 10; // public static final 생략되있음 옆으로 꺾이면 static 찐해지면 final
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);

	}

}
