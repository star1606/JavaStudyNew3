package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


//서버소켓: 연결을 요청받는것
public class MySocketServer {

	ServerSocket serverSocket; //선언했다
	Socket socket;
	BufferedReader br;
	
	public MySocketServer() throws Exception {

		
			serverSocket = new ServerSocket(15000); //서버 소켓 생성 (연결을 받는)
			socket = serverSocket.accept();         //요청을 대기 (while돌면서 연결들어왔나 확인중 )
		    System.out.println("요청이 들어옴");	//연결되면 소켓을 리턴;
		
			
			 br = //앞에 bufferedreader 지워야지 됨 왜냐하면 지역변수로 선언이 되니까 전역변수 위에 만들어놓음 전체써먹게
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String msg = "";
			while((msg=br.readLine()) != null) {
				System.out.println("상대방 : " + msg);
			}
			
		
			br.close();
			socket.close();
			serverSocket.close();
	
		
		
	}


	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
			
	}

}
