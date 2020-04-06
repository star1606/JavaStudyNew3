package ch08;

import com.google.gson.Gson;

class Family{
	int 샵 = 2;
	String 아버지 = "홍판서";
	String 어머니 = "춘섬";
	
			
	
}

class Person {
	String 이름 = "홍길동";
    int 나이 = 25;
    String 성별 = "여";
    String 주소 = "서울특별시 양천구 목동";
    String[] 특기 = {"농구", "도술"};
    Family 가족관계 = new Family();
    String 회사 = "경기 수원시 팔달구 우만동";
}
 	//통신할 때 JSON으로 바꿔야함
	// JSON을 자바 오브젝트로 바꾸는 이유는 .써서 들어가려고
	// Buffered reader 데이터입력을 하는데 다운을받는다

public class JsonEx01 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		// fromJson() 함수 : json(String타입) => java object
		// toJson() 함수 : java object => json(String타입)
		// 통신으로부터 받는 데이터타입은 다 String이다 (문자)
		//String personJson = gson.toJson(new Person());
		Person p = new Person();
		String personJson = gson.toJson(p);
		System.out.println(personJson);

	}

}
