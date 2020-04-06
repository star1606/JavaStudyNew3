package SelfStudy;

//메소드의 정의와 호출
//메소드

public class SelfStudyEx14 {
	public static void numbering() {  
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		} //중괄호 열려있고 쭉 설명써져있으면 메소드 정의
	}

	public static void main(String[] args) {
		numbering();				//단순히 메소드();면 호출
									//main에 넣어서 무언가 실행을함
	}
				
}
