package coffeeshop;

import java.util.ArrayList;

public class CoffeeApp {

	public static void main(String[] args) {
		// �޴�, �ٸ���Ÿ, �մ�
		Consumer consumer = new Consumer();
		Barista barista = new Barista();

		MenuItem m1 = new MenuItem("�Ƹ޸�ī��", 1500);
		MenuItem m2 = new MenuItem("ī���", 2500);
		MenuItem m3 = new MenuItem("īǪġ��", 4000);
		
		
		ArrayList<MenuItem> menuItems = 
				new ArrayList<>();
				
		menuItems.add(m1);
		menuItems.add(m2);
		menuItems.add(m3);
		
		Menu menu = new Menu(menuItems);
		// System.out.println(menuItems.get(1).getName());     //�̸������� ī����
		
		consumer.�ֹ�("�Ƹ޸�ī��", menu, barista);
		consumer.�ֹ�("���Ƹ޸�ī��", menu, barista);
		consumer.�ֹ�("īǪġ��", menu, barista);
		
	}

}
