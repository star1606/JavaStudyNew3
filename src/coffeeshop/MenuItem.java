package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//클래스 자료형: 데이터만 가진 Object = Beans = Table(DB)
//책임은 없고 데이터만 있음

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	private String name;
	private int price;

}
