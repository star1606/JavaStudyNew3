package ch16;
//��, Beans(��)
//DB�� �ִ� ���ڵ带 �ڹټ����� ������Ʈ�� �ٲٴ� ���� �𵨸��̶����

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
