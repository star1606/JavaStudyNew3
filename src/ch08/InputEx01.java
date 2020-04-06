package ch08;

import java.io.IOException;
import java.io.InputStream;

//스트림 (Byte) => 물의 흐름
//물이 흐를 때 수도꼭지를 잠궈두면 물이 흐르지 않는다
//물이 흐를 때 수도꼭지를 열면 물이 흐른다. (통신시작)
// 물 = Byte

public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // 키보드
		try {
			int data = in.read(); // data를 int로 줌 //바이트라서 한바이트 받음
			System.out.println((char) data); // catch는 try가 오류났을 때 어떻게 할지 반응
		} catch (IOException e) { // 나갈때 어떻게 할지 처리
			System.out.println("IO 오류가 발생"); // e 변수로 던져줌
			// e.getMessage(); //오류 알려줌
			// e.printStackTrace(); //추적해서 알려줌

			// InputStream 단점
			// = int 값을 받는다 => 문자 캐스팅 필요
			// = 한 개만 받는다

		}
	}

}
