package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Ŭ���� �ڷ���: �����͸� ���� Object = Beans = Table(DB)
//å���� ���� �����͸� ����

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	private String name;
	private int price;

}
