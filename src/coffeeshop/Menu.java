package coffeeshop;

import java.util.ArrayList;

import lombok.Data;

//책임: 메뉴 선택 --헷갈림
//사물에 모든 책임이 있다 능력
@Data
public class Menu {
	
	
	// 메뉴 아이템들(컬렉션)
	private ArrayList<MenuItem> menuItems; //가변적임, reference임
	
	
	public Menu(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}


	public MenuItem 메뉴선택(String menuName) {
		
		for (MenuItem menuItem : menuItems) {
			if(menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		} 
		
		return null;
	}

}
