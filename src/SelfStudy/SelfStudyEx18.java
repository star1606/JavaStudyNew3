package SelfStudy;

class Data {
	int num = 10;
}

public class SelfStudyEx18 {

	static void 증가(int num) {
		num++;
		System.out.println("증가 num: " + num);

	}
	// 값이 소중하다면 return을 하거나 heap에 옮겨담아야 한다.

	static int 증가1(int num) {
		num++;
		System.out.println("증가1 num: " + num);
		return num; // 함수 종료 직전에 리턴값 받는거
	} // 값을 가짐

	static void 감소(int num) {                 // 지역변수, 스택에 있는 영역에 있는 num이고
		num--;
		System.out.println("감소 num :" + num);
	}

	static void 감소1(Data d) {				   // 같은곳을 바라보고 있다. 
											   // 데이터타입 주소를 가르치고 있다 heap 영역인가
		d.num--;
		System.out.println("감소1 num :" + d.num);

	} // 주소를 가짐

	public static void main(String[] args) {

		int myNum = 100;
		증가(myNum); // call by value passing
		System.out.println("myNum : " + myNum);
		System.out.println();

		증가1(myNum);
		myNum = 증가1(myNum); // call by value passing
		System.out.println("myNum : " + myNum);
		System.out.println();

		Data data = new Data(); // 이 부분 유심히 해볼것.  
		감소(data.num); // call by value passing	
		System.out.println("date.num : " + data.num);
		System.out.println("date.num : " + data.num); // 여기는 10
		System.out.println();

		감소1(data); // call by reference passing //data의 의미
		System.out.println("data.num : " + data.num);
		System.out.println("data.num : " + data.num); // 여기는 9
	}
		//
}		// 광열이 형님한테 여쭤보기
