package airplane;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth =
				new HashMap<>();            //���׸�
	    auth.put("���̵�", "ssarmango");
	    auth.put("��й�ȣ", "1234");
	    // auth.put("���̵�", "cos");
	    
	    
	    
	    System.out.println(auth.get("���̵�"));
	}

}
