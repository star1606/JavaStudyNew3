package ch16;
//모델, Beans(콩)
//DB에 있는 레코드를 자바세계의 오브젝트로 바꾸는 것을 모델링이라고함

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	private int id;
	private String name;
	private String email;
	private String password;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
