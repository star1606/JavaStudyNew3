/*
 * package airplane;
 * 
 * import java.io.BufferedReader; import java.io.InputStreamReader; import
 * java.net.HttpURLConnection; import java.net.URL; import java.util.Scanner;
 * 
 * import com.google.gson.Gson;
 * 
 * public class FlightApp {
 * 
 * public int getTotalCount(String depAirportId, String arrAirportId, Integer
 * depPlandTime, int page) { try { // 1�� �ּ� ��ü ����� URL url = new URL(
 * "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo="
 * +page+ "&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+
 * "&arrAirportId="+
 * FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+
 * "&_type=json");
 * 
 * // 2�� ��Ʈ�� ���� HttpURLConnection con = (HttpURLConnection)
 * url.openConnection();
 * 
 * // 3�� ���� ���� (���ڿ�) BufferedReader br = new BufferedReader(new
 * InputStreamReader(con.getInputStream(), "UTF-8"));
 * 
 * // 4. ���� ���ϱ� StringBuilder sb = new StringBuilder();
 * 
 * String input = ""; while((input = br.readLine()) != null) { sb.append(input);
 * }
 * 
 * System.out.println(sb.toString());
 * 
 * br.close(); // ���� �ݱ� con.disconnect(); // ��Ʈ�� �ݱ�
 * 
 * Gson gson = new Gson(); FlightInfo flightInfo = gson.fromJson(sb.toString(),
 * FlightInfo.class);
 * 
 * return flightInfo.getResponse().getBody().getTotalCount(); } catch (Exception
 * e) { e.printStackTrace(); }
 * 
 * return 0; }
 * 
 * 
 * 
 * 
 * 
 * public static FlightInfo getFlightInfo(String depAirportId, String
 * arrAirportId, Integer depPlandTime, int page) { try { // 1�� �ּ� ��ü ����� URL url
 * = new URL(
 * "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo="
 * +page+ "&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+
 * "&arrAirportId="+
 * FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+
 * "&_type=json");
 * 
 * // 2�� ��Ʈ�� ���� HttpURLConnection con = (HttpURLConnection)
 * url.openConnection();
 * 
 * // 3�� ���� ���� (���ڿ�) BufferedReader br = new BufferedReader(new
 * InputStreamReader(con.getInputStream(), "UTF-8"));
 * 
 * // 4. ���� ���ϱ� StringBuilder sb = new StringBuilder();
 * 
 * String input = ""; while((input = br.readLine()) != null) { sb.append(input);
 * }
 * 
 * System.out.println(sb.toString());
 * 
 * br.close(); // ���� �ݱ� con.disconnect(); // ��Ʈ�� �ݱ�
 * 
 * Gson gson = new Gson(); FlightInfo flightInfo = gson.fromJson(sb.toString(),
 * FlightInfo.class);
 * 
 * return flightInfo; } catch (Exception e) { e.printStackTrace(); }
 * 
 * return null; }
 * 
 * public static void main(String[] args) { FlightInfoService.setAirLineId();
 * FlightInfoService.setAirPortId();
 * 
 * for(String key : FlightInfoService.airPortId.keySet()) {
 * System.out.print(key+ " "); }
 * 
 * System.out.println(); System.out.println("������� �Է��ϼ���."); Scanner sc = new
 * Scanner(System.in); String depAirportId = sc.next(); // ����
 * 
 * System.out.println("�������� �Է��ϼ���."); String arrAirportId = sc.next();
 * 
 * System.out.println("������ڸ� �Է��ϼ���."); String depPlandTimeTemp = sc.next();
 * 
 * 
 * int depPlandTime = Integer.parseInt(depPlandTimeTemp); Integer
 * depPlandTimeInteger = Integer.parseInt(depPlandTimeTemp); Double
 * depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);
 * 
 * //����ȭ ��Ű�¹��� int page = 1; String strTemp = depPlandTime + ""; //���ڿ��� ���ڹٲٴ¹�
 * ""�߰� ���ڵ� ������ ����ȯ String strTemp2 = depPlandTimeInteger.toString(); String
 * strTemp3 = depPlandTimeDouble.toString(); String strTemp4 =
 * depPlandTimeDouble + "";
 * 
 * FlightInfo flightInfo = getFlightInfo(depAirportId,
 * arrAirportId,depPlandTime, page);
 * 
 * 
 * for (Item item : flightInfo.getResponse().getBody().getItems().getItem()) {
 * 
 * //for each����? System.out.println("�װ��� : "+item.getAirlineNm());
 * System.out.println("����� : "+item.getDepAirportNm());
 * System.out.println("������ : "+item.getArrAirportNm());
 * System.out.println("��߽ð� : "+item.getDepPlandTime());
 * System.out.println("�����ð� : "+item.getArrPlandTime());
 * System.out.println("��� : "+item.getEconomyCharge()); System.out.println(); }
 * 
 * ////iteralbe(�ݺ�) // for(Item item : flightItems){ //
 * System.out.println("�װ��� : "+item.getAirlineNm()); //
 * System.out.println("����� : "+item.getDepAirportNm()); //
 * System.out.println("������ : "+item.getArrAirportNm()); //
 * System.out.println("��߽ð� : "+item.getDepPlandTime()); //
 * System.out.println("�����ð� : "+item.getArrPlandTime()); //
 * System.out.println("��� : "+item.getEconomyCharge()); // System.out.println();
 * // }
 * 
 * 
 * }
 * 
 * }
 */