package ch03;

class Data {
	int num = 10;
}

public class MethodEx02 {

	static int 증가(int num) {
		num++;
		System.out.println("증가 num:" + num);
		return num; // 함수 종료 직전에 리턴값 받는거
	} // 값을 가짐

	static void 감소(Data d) {       //static이라 그런가
		d.num--;
		System.out.println("감소 num :" + d.num);
	} // 주소를 가짐

	public static void main(String[] args) {
		int myNum = 100;
		myNum = 증가(myNum);// Value passing
		System.out.println("myNum :" + myNum);

		Data data = new Data(); // Reference passing
		감소(data);
		System.out.println("data.num :" + data.num);

	}
//예제 분석다시해보기
}
//new 하면 static이 아닌것들이 다 뜬다