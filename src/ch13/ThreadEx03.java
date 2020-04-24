package ch13;

interface Callback{                  //�Լ� �ѱ���� �Լ�����
	void printMoney(int money);
	
}

class MoneyChange{
	int money = 10000;
	
	public void accept(Callback callback) {
		// ���࿡ ���� ��û�� �ؼ� 20000���� ���� ���� 2��!
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000;
					callback.printMoney(money);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}).start(); // main �����尡 ��������ش� ��������ο�� ����
	                 //�׳� �����ϸ� 10000������
					
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		MoneyChange mc = new MoneyChange();
		mc.accept(new Callback() {
			
			@Override
			public void printMoney(int money) {
				System.out.println("������ �ܾ���:" + money);
				
			}
		});
		for (int i = 1; i < 6; i++) {
			System.out.println("���ξ�����:" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
	
		//main �� �Լ��� ���� ���� �����忡 ������� �� �ִ�.
		//
		
				
	}

}
