package datexx;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// 6���� ��ȣ - (1~ 45)
		
		//�迭�� ����� �ߺ�ó�� �ϴ� �� �����
		//set �������Ѵ�
		//HashSet ������ ����(��û ����)
		//TreeSet ������� ���� (HashSet���� ����)
		
		Set<Integer> lottoSet = new HashSet<>();  // WrapperŬ����
		Random r = new Random();
		while (lottoSet.size()<6) {
			int value = r.nextInt(45)+1;
			lottoSet.add(value);
		}
		System.out.println(lottoSet);
	}

}
