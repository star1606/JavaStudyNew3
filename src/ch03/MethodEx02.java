package ch03;

class Data {
	int num = 10;
}

public class MethodEx02 {

	static int ����(int num) {
		num++;
		System.out.println("���� num:" + num);
		return num; // �Լ� ���� ������ ���ϰ� �޴°�
	} // ���� ����

	static void ����(Data d) {       //static�̶� �׷���
		d.num--;
		System.out.println("���� num :" + d.num);
	} // �ּҸ� ����

	public static void main(String[] args) {
		int myNum = 100;
		myNum = ����(myNum);// Value passing
		System.out.println("myNum :" + myNum);

		Data data = new Data(); // Reference passing
		����(data);
		System.out.println("data.num :" + data.num);

	}
//���� �м��ٽ��غ���
}
//new �ϸ� static�� �ƴѰ͵��� �� ���