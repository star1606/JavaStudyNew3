package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */
public class ExampleSend {
  public static void main(String[] args) {
    String api_key = "NCSTDQATTTQG1J5M";
    String api_secret = "Z0EOD0BMHZASMQ3SAYUMTFVXHYO9TIAD";
    Message coolsms = new Message(api_key, api_secret);

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", "01063826233");
    params.put("from", "01063826233");
    params.put("type", "SMS");
    params.put("text", "나의 첫번째 메세지 전송 프로그램 테스트 ^^");
    params.put("app_version", "test app 1.2"); // application name and version

    try {
      JSONObject obj = (JSONObject) coolsms.send(params);  //제이슨오브젝트로 받는다
      System.out.println(obj.toString());					//응답 제이슨으로옴
    } catch (CoolsmsException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
    }
  }
}