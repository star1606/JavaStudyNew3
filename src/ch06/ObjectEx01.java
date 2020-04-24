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
		
		String d1 = "��";
		String d2 = "��";
		//equals ���� �ּҿ� �ִ������� �ٸ��� �˻���
		
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		
		
		String d3 = new String("��");
		String d4 = new String("��");
		
		System.out.println(d3.equals(d4));
		System.out.println(d3 == d4); //d3 , d4 ���۷��� �ּҸ�����������
		
		System.out.println(d3.getClass()); //��ο� �̸� ������
		System.out.println(new ObjectEx01().getClass());
		
		//�ؽ� �ڵ� -> �ؽ��˰��� = ������ ������ ���ڷ� ����
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());  //���� ������ ���� �ؽ��ڵ峪���� �س���
										// ���������� �ִ°� �ƴѴ� �ؽ��ڵ��
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode()); //String�� ��������
										//new 2���ؼ� ���� �ּ��ϸ��� ����
		
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Animal);
		
	}

}
