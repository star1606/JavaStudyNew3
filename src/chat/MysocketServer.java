package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
// 컨트롤 쒸프트 O


public class MysocketServer {

	
	ServerSocket serverSocket;   // 더 넓은공간에서 필요하니까 전역변수에 놓은거임 (heap에다가 필요하니까)
	Vector<NewSocketThread> vt;  //arrayList 같은 것
	
	public MysocketServer() throws Exception{
		vt = new Vector<>();					//메인스레드 벡터를 만듬
	 serverSocket  = new ServerSocket(3000);
	
	while(true) {                                         	//Socket socket 새로선언해서 새로만든다는것
		Socket socket = serverSocket.accept(); //서버소켓  요청받고나서 다른애 채팅시킴  
		System.out.println("요청이 들어옴");   //그래서 새로운 스레드 필요함 내부클래스로만듬;;
		NewSocketThread nt = new NewSocketThread(socket); //소켓만들고 새로운 스레드 만들고 새로운스레드에 소켓연결시킴 
													//다시 돌아와서 대기함 또 연결오면 새로운 스레드 채팅을해야한다.
													//buffered write, reader 연결주면됨
		Thread newWorker =  new Thread(nt);	   //타겟이 필요
		newWorker.start();		
		vt.add(nt); 							//nt가 소켓을 들고있다.
	}
	
	
	}
	
	
	//새로운 스레드에게 버퍼를 연결할 수 있게 socket을 전달!!
	class NewSocketThread implements Runnable{
		
		Socket socket;
		BufferedReader br;
		BufferedWriter bw;
		public NewSocketThread(Socket socket) {
			this.socket = socket;
		}
		
		
		@Override
		public void run() {
			try {
				 br =
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				 bw =
								new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String msg = "";
				while((msg = br.readLine()) != null) {
					
					
	
					
					for (NewSocketThread newSocketThread : vt) { 
						System.out.println("클라이언트:" + msg);
						if(newSocketThread != this) {
							newSocketThread.bw.write(msg);
							newSocketThread.bw.flush();
						}
						newSocketThread.bw.write(msg + "\n");	
						newSocketThread.bw.flush();  //buffer에 데이터 다 차면 flush해줘야함
					}
					
					}
				
						
						
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		try {
			new MysocketServer();
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
		
		

	}

}
