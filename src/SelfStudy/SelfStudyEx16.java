package SelfStudy;


//�޼ҵ��� ��� Return

public class SelfStudyEx16 {

	public static String numbering(int init, int limit) { //String ���ڿ��� ������ �Ұ��̴�
		int i = init;
		// ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
		String output = "";
		while (i < limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			output += i;
			i++;
		}
		// �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
		// ��ġ�ϸ� �ȴ�.
		return output;    //output : 1234 !!
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� ������ ���� ���� result�� ����.
		String result = numbering(1, 5);
		// ���� result�� ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);
	}
}


// return -�����ش�.
//�޼ҵ��� �Է°� ��°����� �޼ҵ��� ���Ǻ���
//���ϳ����� �޼ҵ��� ��°����� �ܺη� ��ȯ��
//������ ���� ���� ��ǰ�� ��ġ�� ���̱� ���ؼ�
//ȭ�����, ���Ϻ�����, �ٸ��� ���� �� �ְ�
