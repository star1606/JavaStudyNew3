package coffeeshop;

//å��: �ֹ�
public class Consumer {

	public void �ֹ�(String menuName, Menu menu, Barista barista) {
		
		// �մ��� �޴��ǿ��� �޽����� ������. (�޴� ��������)
		MenuItem menuItem = menu.�޴�����(menuName);
	
		
		
		if(menuItem == null) {
			System.out.println(menuName+"�� �츮 Ŀ�Ǽ� �����ϴ�.");
		}else {
			//�մ��� �ٸ���Ÿ���� �޽����� ������. (Ŀ�� ��������)
			Coffee coffee = barista.Ŀ�ǻ���(menuItem);
			
			System.out.println("Ŀ�� ���Խ��ϴ�.");
			System.out.println(coffee.getName());
			System.out.println(coffee.getName());
		}
		
	}

}
