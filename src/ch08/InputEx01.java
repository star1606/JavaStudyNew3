package ch08;

import java.io.IOException;
import java.io.InputStream;

//��Ʈ�� (Byte) => ���� �帧
//���� �带 �� ���������� ��ŵθ� ���� �帣�� �ʴ´�
//���� �带 �� ���������� ���� ���� �帥��. (��Ž���)
// �� = Byte

public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // Ű����
		try {
			int data = in.read(); // data�� int�� �� //����Ʈ�� �ѹ���Ʈ ����
			System.out.println((char) data); // catch�� try�� �������� �� ��� ���� ����
		} catch (IOException e) { // ������ ��� ���� ó��
			System.out.println("IO ������ �߻�"); // e ������ ������
			// e.getMessage(); //���� �˷���
			// e.printStackTrace(); //�����ؼ� �˷���

			// InputStream ����
			// = int ���� �޴´� => ���� ĳ���� �ʿ�
			// = �� ���� �޴´�

		}
	}

}
