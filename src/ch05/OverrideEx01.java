package ch05;

class A{
	void run() {
		System.out.println("A 달린다.");
	}
}

class B extends A{
	@Override
	void run() {
		System.out.println("B 달린다.");
		
	}
}



class C extends B{
	@Override
	void run() { 
		String name = "C";
		System.out.println( name+" 달린다.");
		
	}
	
}




public class OverrideEx01 {

	public static void main(String[] args) {

		
		A a1 = new C();
		a1.run();
		B b1 = new C();
		b1.run();
		
		A aa1 = new B();  //A B
		aa1.run();   // B가출력됨
		
//		C c2 = new A();
//		 c2.run();   안나옴
	}

}
