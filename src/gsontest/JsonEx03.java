package gsontest;

import com.google.gson.Gson;

//{"name":"�ڽ�", "age":40} //Ű���� ""�־����



public class JsonEx03 {

	public static void main(String[] args) {
		//1. �ٿ���� json ������
		String jsonData = "{\"name\":\"�ڽ�\", \"age\":40}";
		System.out.println(jsonData);

		
		//2. json������ => java ������Ʈ ��ȯ
		Gson gson = new Gson();
	
		
	}

}
