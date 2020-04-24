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
			// 1�� �ּ� ��ü �����
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=M8rOfwxhpqXs0x0xQKVDocowB9TRJoA9I5lg5ZgwqZHsj3rZ1erf2NkjpwRLoPgk1vB%2BZUJQSLWHVh2LXK1azQ%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");

			// 2�� ��Ʈ�� ���� //alt + enter ���� ã��
			HttpURLConnection con = (HttpURLConnection) url.openConnection();  	// con ���̹��� ����� ��Ʈ����

			
			// 3�� ���� ���� (���ڿ��� ���۵�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));


			
			// 4�� ���� ���ϱ� - ���ڸ� ���� ���� StringBuilder�� ���� data = data +input�̷��� �Ⱦ��� �ڹ� String constant pool ���� ������.
			StringBuilder sb = new StringBuilder();
			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			
			
			
		} catch (Exception e) { // return�ϴ°� urlĿ�ؼ��̴ϱ� http�� �ٿ�ĳ��������
			//�θ� ����Ű�� �����ϱ�
			// �ٿ��Ŵ �ٿ�ĳ�������� ������ ��Ȯ�ϰԽ�� - �������̵����� �ڽ�Ŭ���� �Լ�����
			e.printStackTrace();
		}
			Gson gson = new Gson();
			
		
		
	}

}
