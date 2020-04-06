package ch04;

class Airplane { // 여기서 생성자 만들어라
	String name;
	String color;

	// 생성자 만들기
	public Airplane(String name, String color) {

		this.name = name;
		this.color = color;
	}

	// alt + shitf + s + o 생성자만들기.

}

public class ThistTestEx01 {

	public static void main(String[] args) {
		Airplane a1 = new Airplane("제트키", "하얀색");

		Airplane a2 = new Airplane("항공기", "노란색");

	}

}
