package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//ĳ���� �� �ϰ� �ٷ� ���ڷ� �а� ����
// �� �� �̻��� �ް� �;��
// ���� �� ��
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

		// return �� �޾Ƶ� ��
		// �ֳ��ϸ� reference��
		// ������ �ƴ϶� heap�� �ִ� �ּҸ� ����Ű�� �־
		// ���� int�̸� return���� �޾ƾ���

	}

}
