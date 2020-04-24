package ch06;

class Animal{
	@Override
	public int hashCode() {
		return super.hashCode();
		//return 1111;
	}
}


public class ObjectEx01 {

	public static void main(String[] args) {
		
		String d1 = "물";
		String d2 = "물";
		//equals 같은 주소에 있는지보고 다르면 검사함
		
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		
		
		String d3 = new String("물");
		String d4 = new String("물");
		
		System.out.println(d3.equals(d4));
		System.out.println(d3 == d4); //d3 , d4 레퍼런스 주소를가지고있음
		
		System.out.println(d3.getClass()); //경로와 이름 리턴함
		System.out.println(new ObjectEx01().getClass());
		
		//해쉬 코드 -> 해쉬알고리즘 = 동일한 길이의 숫자로 리턴
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());  //값이 같으면 같은 해쉬코드나오게 해놨음
										// 같은공간에 있는게 아닌다 해쉬코드라서
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode()); //String은 같게했음
										//new 2번해서 같은 주소일리가 없음
		
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		
	}

}
