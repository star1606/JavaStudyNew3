package SelfStudy;

class Data {
	int num = 10;
}

public class SelfStudyEx18 {

	static void ����(int num) {
		num++;
		System.out.println("���� num: " + num);

	}
	// ���� �����ϴٸ� return�� �ϰų� heap�� �Űܴ�ƾ� �Ѵ�.

	static int ����1(int num) {
		num++;
		System.out.println("����1 num: " + num);
		return num; // �Լ� ���� ������ ���ϰ� �޴°�
	} // ���� ����

	static void ����(int num) {                 // ��������, ���ÿ� �ִ� ������ �ִ� num�̰�
		num--;
		System.out.println("���� num :" + num);
	}

	static void ����1(Data d) {				   // �������� �ٶ󺸰� �ִ�. 
											   // ������Ÿ�� �ּҸ� ����ġ�� �ִ� heap �����ΰ�
		d.num--;
		System.out.println("����1 num :" + d.num);

	} // �ּҸ� ����

	public static void main(String[] args) {

		int myNum = 100;
		����(myNum); // call by value passing
		System.out.println("myNum : " + myNum);
		System.out.println();

		����1(myNum);
		myNum = ����1(myNum); // call by value passing
		System.out.println("myNum : " + myNum);
		System.out.println();

		Data data = new Data(); // �� �κ� ������ �غ���.  
		����(data.num); // call by value passing	
		System.out.println("date.num : " + data.num);
		System.out.println("date.num : " + data.num); // ����� 10
		System.out.println();

		����1(data); // call by reference passing //data�� �ǹ�
		System.out.println("data.num : " + data.num);
		System.out.println("data.num : " + data.num); // ����� 9
	}
		//
}		// ������ �������� ���庸��
