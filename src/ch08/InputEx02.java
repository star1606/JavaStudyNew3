package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//캐스팅 안 하고 바로 문자로 읽고 싶음
// 한 개 이상을 받고 싶어요
// 거의 안 씀
public class InputEx02 {

	public static void main(String[] args) {
		InputStream in = System.in;

		InputStreamReader reader = new InputStreamReader(in);

		char[] data = new char[3];
		try {
			reader.read(data);
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// return 안 받아도 됨
		// 왜냐하면 reference라서
		// 스택이 아니라 heap에 있는 주소를 가르키고 있어서
		// 만약 int이면 return값을 받아야함

	}

}
