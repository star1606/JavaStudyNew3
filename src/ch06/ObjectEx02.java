package ch06;


class Person{
	String name = "ȫ�浿";
	int age = 15;
	String job = "�л�";
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
	
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
		Integer num = 10;
		String s = Integer.toString(num);    //String���� �ٲ� �� ����
		System.out.println(s);
		
		
		Person p = new Person();
		System.out.println(p.toString()); //������ �ּҳ���
		System.out.println(p);          //�������̵��ؼ� �ڱ�鸸�� �����Ǹ���
											//toString �������̵�
		//���۷��� �ּҸ� ȣ���ص� toString
		
		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�");
		sb.append("�ݰ���");
		
		System.out.println(sb.toString()); //toString ȣ���
	}										//stringȭ ���Ѽ� ������

}
