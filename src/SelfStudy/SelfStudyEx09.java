package SelfStudy;

public class SelfStudyEx09 {
	public static String numbering(int init, int limit) {
		int i = init;
		// ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
		String output = "";
		while (i < limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			output += i;
			i++;
		}
		// �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
		// �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
		// ��ġ�ϸ� �ȴ�.
		return output;
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� ������ ���� ���� result�� ����.
		String result = numbering(1, 5);
		// ���� result�� ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);
	}
}

/////��ƴ�...