package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class NetworkEx10 {


	
	
	
	public static void main(String[] args) {

		try {
			// 1번 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=M8rOfwxhpqXs0x0xQKVDocowB9TRJoA9I5lg5ZgwqZHsj3rZ1erf2NkjpwRLoPgk1vB%2BZUJQSLWHVh2LXK1azQ%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");

			// 2번 스트림 연결 //alt + enter 오류 찾기
			HttpURLConnection con = (HttpURLConnection) url.openConnection();  	// con 네이버에 연결된 스트림선

			
			// 3번 버퍼 연결 (문자열로 전송됨)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));


			
			// 4번 문자 더하기 - 문자를 더할 때는 StringBuilder를 쓴다 data = data +input이렇게 안쓴다 자바 String constant pool 문제 때문에.
			StringBuilder sb = new StringBuilder();
			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			
			
			
		} catch (Exception e) { // return하는게 url커넥션이니까 http로 다운캐스팅해줌
			//부모를 가르키고 있으니까
			// 다운시킴 다운캐스팅으로 내려서 정확하게써라 - 오버라이딩으로 자식클래스 함수써짐
			e.printStackTrace();
		}
			Gson gson = new Gson();
			
		
		
	}

}
