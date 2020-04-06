package SelfStudy;


//메소드의 출력 Return

public class SelfStudyEx16 {

	public static String numbering(int init, int limit) { //String 문자열로 리턴을 할것이다
		int i = init;
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output = "";
		while (i < limit) {
			// 숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output += i;
			i++;
		}
		// 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
		// 배치하면 된다.
		return output;    //output : 1234 !!
	}

	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1, 5);
		// 변수 result의 값을 화면에 출력한다.
		System.out.println(result);
	}
}


// return -돌려준다.
//메소드의 입력값 출력값보고 메소드의 정의볼것
//리턴나오면 메소드의 출력값으로 외부로 반환함
//리턴을 쓰는 이유 부품의 가치를 높이기 위해서
//화면출력, 메일보내기, 다르게 사용될 수 있게
