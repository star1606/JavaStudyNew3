package animal;

//Interface Ư¡
//1. ���� : public static final ����
//2. �Լ�: public abstract ����
//3. ����� ������ �� - �������ε�
//4. ������ �߻� �޼��常 ���簡�� = �������� �ο�
//5. new �� �� ����. (�ڽ��� new�ؼ� ���� �ٿ�� ��� �ۿ� ����!)
//6. �����ڵ�� ��밡�� = �������� �ش�
interface Cal {
	int num = 10; // public static final ���������� ������ ���̸� static �������� final
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);

	}

}
