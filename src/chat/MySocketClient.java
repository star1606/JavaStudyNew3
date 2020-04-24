package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch08.InputEx01;















public class MySocketClient {

	Socket socket;
	
	public MySocketClient()throws Exception {
		socket = new Socket("localhost", 3000);
	
		
		//new Thread(new ReadThread()).start();
		ReadThread rt = new ReadThread();
		Thread newWorker = new Thread(rt);  //타겟 정해서 넣어줘야함
		newWorker.start();
		
		BufferedWriter bw =
		new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		BufferedReader keyboardIn =					//reader 두개필요함 
		new BufferedReader(new InputStreamReader(System.in));
																//서버랑 키보드 받는거
		String outputMsg = "";
		
		//새로운 스레드만드는건 while위에
		
		//메인 스레드는 여기서 무한루프
		while((outputMsg = keyboardIn.readLine()) != null) {
			bw.write(outputMsg + "\n");
			bw.flush();
		}
	}
	
		class ReadThread implements Runnable {
			@Override
			public void run() {
				try {
					BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String inputMsg = "";
					while((inputMsg = br.readLine()) != null) {
						System.out.println("상대방:" + inputMsg);
					}
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				
			}
		}
	
	
	
	
	//브로드캐스팅 " 서버에서 다 던지고 소켓이 자기가 받을지 안 받을지 정하는거
	//지금하는방식은 서버에서 걸러내서 던지는거 (선택적으로)
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

}
