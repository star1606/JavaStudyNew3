package composite;

public class ��� {

	String item1;
	String item2;
	String item3;

	// ����Ʈ ������
	public ���() {
		this("��", "�Ǵ��⽺��", "�и�����");
	}

	public ���(String item1) {
		this(item1, "�Ǵ��⽺��", "�и�����");

	}

//	public ���(String item3) {
//		this("�Ҷ߹�", "�и�����", item3);
//	
//	}

	public ���(String item1, String item3) {
		this(item1, null, item3);

	}

	public ���(String item1, String item2, String item3) {

		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}

	public static void main(String[] args) {
		��� l1 = new ���("��", "�Ǵ��⽺��", "�и�����");
		��� l2 = new ���(); // �����ڸ� ����� ����.
		��� l3 = new ���("�Ҷ߹�", "�Ǵ��⽺��", "�и�����");
		��� l4 = new ���("�Ҷ߹�", "�Ǵ��⽺��", "�и�����");
		��� l5 = new ���("�Ҷ߹�", "�Ǵ��⽺��", "�и�����");
		��� l6 = new ���();
		��� l7 = new ���("�Ҷ߹�", "�Ǵ��⽺��", "�и�����");
		��� l8 = new ���("�Ҷ߹�"); // �����ε����� �Ű����� �ϳ��� �� ����

	}

}
