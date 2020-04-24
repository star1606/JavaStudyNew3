package datexx;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// 6개의 번호 - (1~ 45)
		
		//배열로 만드면 중복처리 하는 데 힘들다
		//set 만들어야한다
		//HashSet 순서가 없음(엄청 빠름)
		//TreeSet 순서대로 정렬 (HashSet보다 느림)
		
		Set<Integer> lottoSet = new HashSet<>();  // Wrapper클래스
		Random r = new Random();
		while (lottoSet.size()<6) {
			int value = r.nextInt(45)+1;
			lottoSet.add(value);
		}
		System.out.println(lottoSet);
	}

}
