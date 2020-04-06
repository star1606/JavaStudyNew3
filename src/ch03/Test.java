package ch03;

public class Test {

	int num = 10;

	void hello() {
		System.out.println(num);
	}

	public static void main(String[] args) {

	}

}
// static에 num은 알 수가 없기 때문에   int num= 10; 은 heap부분에 있음
// static은 heap보다 빨리 뜨기 때문에 heap변수 사용 ㄴㄴ