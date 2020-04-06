package gsontest;

import com.google.gson.Gson;

//{"name":"코스", "age":40} //키값에 ""있어야함



public class JsonEx03 {

	public static void main(String[] args) {
		//1. 다운받은 json 데이터
		String jsonData = "{\"name\":\"코스\", \"age\":40}";
		System.out.println(jsonData);

		
		//2. json데이터 => java 오브젝트 변환
		Gson gson = new Gson();
	
		
	}

}
