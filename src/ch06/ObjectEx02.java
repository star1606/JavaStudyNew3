package ch06;


class Person{
	String name = "홍길동";
	int age = 15;
	String job = "학생";
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
	
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
		Integer num = 10;
		String s = Integer.toString(num);    //String으로 바꿀 수 있음
		System.out.println(s);
		
		
		Person p = new Person();
		System.out.println(p.toString()); //원형은 주소나옴
		System.out.println(p);          //오버라이딩해서 자기들만의 재정의를함
											//toString 오버라이딩
		//레퍼런스 주소만 호출해도 toString
		
		StringBuilder sb = new StringBuilder();
		sb.append("안녕");
		sb.append("반가워");
		
		System.out.println(sb.toString()); //toString 호출됨
	}										//string화 시켜서 리턴함

}
