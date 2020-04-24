package chatV4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import chatV4.SocketServer.SocketThread;

public class SocketClient {

	
	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	Scanner sc;
	
	public SocketClient() {
		try {
			//accept()ȣ��ǰ�, ������ ���������, ���Ϳ� �߰���.
			socket = new Socket("localhost", 20000);
			SocketThread st = new SocketThread();
			st.start();
			
			writer = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			while(true) {
				String line = sc.nextLine();
				//ALL : �ȳ�
				//MSG : White : �ȳ�
				writer.println(line);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	class SocketThread extends Thread {
			
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println("from server:" + line);
				}
			}catch (Exception e) {
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new SocketClient();
	}

}
