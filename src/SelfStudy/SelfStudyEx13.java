package SelfStudy;

//cal 부분 return을 이해할 수 있는 부분. 매개변수도 생각해보기
public class SelfStudyEx13 {

	// 1. 리턴 넣고 sysout 다 넣은 경우
	static int add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("result: " + result); // 리턴이 왜 필요하지?
		return result; // 이렇게 쓴다.
	}
	// 함수에 리턴값없으면 그냥 소멸함 출력하는 부분이 없으니까
	// add(3,5)라고 쓰면 그냥 오류발생 그래서 return 써줌

	// 2. 리턴을 안 넣고 sysout 넣은 경우
//	static int minus(int m1, int m2) { 
//		int result2 = m1 - m2;
//		System.out.println("result: " + result2);
//		
//	} 출력이 안됨 왜냐하면 return설정안해서 함수끼리 주고 받는게
	//안되니까
	// return은 함수끼리 주고 받는거 sysout 눈에 보이게 출력하는거

	
	// 3. 리턴을 넣었고 sysout을 안 넣은경우
	static int minus(int m1, int m2) {
		int result2 = m1 - m2;
		return result2;
	}

	
	
	public static void main(String[] args) {
		add(3, 5);
		

		minus(6, 4);    // 함수를 출력하지만
		                // sysout이 없으니까 값이 아무것도 안나옴
		
		System.out.println(minus(10,5)); // 이렇게 해야지 나옴
		
		
		
	}

}
