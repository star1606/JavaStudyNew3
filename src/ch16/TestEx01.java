package ch16;

class MyConnection {
	

}

class MyJDBC extends MyConnection{
	
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("������ ȣ��");
	}
	static { //new�Ҷ� static ���ΰ� ȣ��� 	  //��ü�� �����ϱ����� �ʱ�ȭ�ϰ� ���� ��
		conn = new MyJDBC();
		//System.out.println("static �ʱ�ȭ ȣ��"); //ó���� ����
	}											  //��ü ������(new) �ڵ����� �������
}

public class TestEx01 {

	public static void main(String[] args) {
		//MyJDBC mj = new MyJDBC();
		try {
			Class.forName("ch16.MyJDBC");
			MyConnection conn = MyJDBC.conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		// �����ͺ��̽� -> ����������
}	    // ����̹��Ŵ����� ����Ŭ�� ���õ� ������ �� �����Ѵ�
		// ����Ŭ����̹����� �����Ϸ��� ����̹��Ŵ����� ���ؼ� ����
	 	// Class.forNmae("Ŭ����")�ϸ�(static����) ����Ŭ ����̹���� �ߴµ� ����̹��Ŵ���(�ּҰ���������)�� ���ο��� ��������ش�
		// forName�Ѵ����� ����̹��Ŵ����� �����ϱ⸸�ϸ�ȴ� 
