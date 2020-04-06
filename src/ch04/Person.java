package ch04;




//상태와 행동
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;


	
	public Person(String name, String job, String bloodType) {
		super();
		this.name = name;
		this.job = job;
		this.bloodType = bloodType;
	}


	//디폴트 생성자(매개변수가 없는아이)  없으면자동으로 컴파일러가 만든다
	//초기화
	public Person() {  //클래스하고 이름이 똑같은 함수 생성자 (constructor) 생성자 =초기화 용도.
		
		
		
	}


//매개변수 생성자
//함수 이름은 똑같은데 왜 실행됨 - 오버로딩 - 매개변수있는함수랑 없는함수랑 이름같으면 생성됨

	public Person(String name, String job, int age, char gender, String bloodType) {
	
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	

}
