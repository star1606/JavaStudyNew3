package ch13;


class Car{
	void run() {
		System.out.println("�ڵ����� �޸���.");
	}
}

class Sonata extends Car{  //�޼ҵ� ������ ���ʿ���� �״�δ�
	
	
	
}



class Granger extends Car{
	@Override
	void run() {
		
		super.run();
	}
}

public class AnomyEx03 {
	
	static void start(Car c) {
		c.run();
	
	}

	public static void main(String[] args) {
		start(new Sonata());
		
		

	}

}
