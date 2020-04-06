package coffeeshop.test;

//Generic (일반적인) - 클래스 생성시 타입결정
//E - Element, K - key, V - Value, T - Type, N - Number
class Data<H> {
	H value;
}

class Str<K, V> {
	K k;
	V v;
}

public class GenericEx01 {

	public static void main(String[] args) {
		Data<String> data = new Data();
		data.value = "문자열";
		System.out.println(data.value);

		// <>쓰는게 제네릭
		// Wrapper 클래스 - 기본자료형을 클래스화 시키는 기술 byte - Byte
		// int - Integer, long - Long, char - Character
		Data<Integer> data2 = new Data();
		data2.value = 10;
		System.out.println(data2.value);
		// <> 안에는 기본자료형은 못들어간다 <> 레퍼런스자료형만 들어간다

		Str<String, String> s = new Str<>();
		s.k = "비밀번호";
		s.v = "bitc5500";

		System.out.println(s.k);
		System.out.println(s.v);

	}

}
