package gsontest;

import com.google.gson.Gson;


class Person{
	String �̸�;
	int ����;
	String ����;
	String �ּ�;
	String[] Ư��;
	Family ��������;
	String ȸ��;
	
}

class Family{
	int ��;
	String �ƹ���;
	String ��Ӵ�;
}


public class GsonEx01 {

	public static void main(String[] args) {
		String jsonPerson =
				"{\"�̸�\":\"ȫ�浿\","
				+ "\"����\":25,"
				+ "\"����\":\"��\","
				+ "\"�ּ�\":\"����Ư���� ��õ�� ��\","
				+ "\"Ư��\":[\"��\",\"����\"],"
				+	 "\"��������\":"
				+ 		 "{\"��\":2,"
				+		 "\"�ƹ���\":\"ȫ�Ǽ�\","
				+ 		 "\"��Ӵ�\":\"�ἶ\"},"
				+ "\"ȸ��\":\"��� ������ �ȴޱ� �츸��\"}\r\n" + 
				"";
		
		Gson gson = new Gson(); //��ü �����
		Person p = gson.fromJson(jsonPerson, Person.class);
		System.out.println(p.�̸�);
		System.out.println(p.��������.��);
	}
		//�ϳ��� ���Ͽ��� �ϳ��� public Ŭ������ ����
}
