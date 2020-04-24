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
 * depPlandTime, int page) { try { // 1번 주소 객체 만들기 URL url = new URL(
 * "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo="
 * +page+ "&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+
 * "&arrAirportId="+
 * FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+
 * "&_type=json");
 * 
 * // 2번 스트림 연결 HttpURLConnection con = (HttpURLConnection)
 * url.openConnection();
 * 
 * // 3번 버퍼 연결 (문자열) BufferedReader br = new BufferedReader(new
 * InputStreamReader(con.getInputStream(), "UTF-8"));
 * 
 * // 4. 문자 더하기 StringBuilder sb = new StringBuilder();
 * 
 * String input = ""; while((input = br.readLine()) != null) { sb.append(input);
 * }
 * 
 * System.out.println(sb.toString());
 * 
 * br.close(); // 버퍼 닫기 con.disconnect(); // 스트림 닫기
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
 * arrAirportId, Integer depPlandTime, int page) { try { // 1번 주소 객체 만들기 URL url
 * = new URL(
 * "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo="
 * +page+ "&depAirportId="+FlightInfoService.airPortId.get(depAirportId)+
 * "&arrAirportId="+
 * FlightInfoService.airPortId.get(arrAirportId)+"&depPlandTime="+depPlandTime+
 * "&_type=json");
 * 
 * // 2번 스트림 연결 HttpURLConnection con = (HttpURLConnection)
 * url.openConnection();
 * 
 * // 3번 버퍼 연결 (문자열) BufferedReader br = new BufferedReader(new
 * InputStreamReader(con.getInputStream(), "UTF-8"));
 * 
 * // 4. 문자 더하기 StringBuilder sb = new StringBuilder();
 * 
 * String input = ""; while((input = br.readLine()) != null) { sb.append(input);
 * }
 * 
 * System.out.println(sb.toString());
 * 
 * br.close(); // 버퍼 닫기 con.disconnect(); // 스트림 닫기
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
 * System.out.println(); System.out.println("출발지를 입력하세요."); Scanner sc = new
 * Scanner(System.in); String depAirportId = sc.next(); // 김포
 * 
 * System.out.println("도착지를 입력하세요."); String arrAirportId = sc.next();
 * 
 * System.out.println("출발일자를 입력하세요."); String depPlandTimeTemp = sc.next();
 * 
 * 
 * int depPlandTime = Integer.parseInt(depPlandTimeTemp); Integer
 * depPlandTimeInteger = Integer.parseInt(depPlandTimeTemp); Double
 * depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);
 * 
 * //문자화 시키는법들 int page = 1; String strTemp = depPlandTime + ""; //숫자에서 문자바꾸는법
 * ""추가 문자됨 묵시적 형변환 String strTemp2 = depPlandTimeInteger.toString(); String
 * strTemp3 = depPlandTimeDouble.toString(); String strTemp4 =
 * depPlandTimeDouble + "";
 * 
 * FlightInfo flightInfo = getFlightInfo(depAirportId,
 * arrAirportId,depPlandTime, page);
 * 
 * 
 * for (Item item : flightInfo.getResponse().getBody().getItems().getItem()) {
 * 
 * //for each문은? System.out.println("항공사 : "+item.getAirlineNm());
 * System.out.println("출발지 : "+item.getDepAirportNm());
 * System.out.println("도착지 : "+item.getArrAirportNm());
 * System.out.println("출발시간 : "+item.getDepPlandTime());
 * System.out.println("도착시간 : "+item.getArrPlandTime());
 * System.out.println("요금 : "+item.getEconomyCharge()); System.out.println(); }
 * 
 * ////iteralbe(반복) // for(Item item : flightItems){ //
 * System.out.println("항공사 : "+item.getAirlineNm()); //
 * System.out.println("출발지 : "+item.getDepAirportNm()); //
 * System.out.println("도착지 : "+item.getArrAirportNm()); //
 * System.out.println("출발시간 : "+item.getDepPlandTime()); //
 * System.out.println("도착시간 : "+item.getArrPlandTime()); //
 * System.out.println("요금 : "+item.getEconomyCharge()); // System.out.println();
 * // }
 * 
 * 
 * }
 * 
 * }
 */