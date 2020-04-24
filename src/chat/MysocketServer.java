package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
// ��Ʈ�� ����Ʈ O


public class MysocketServer {

	
	ServerSocket serverSocket;   // �� ������������ �ʿ��ϴϱ� ���������� �������� (heap���ٰ� �ʿ��ϴϱ�)
	Vector<NewSocketThread> vt;  //arrayList ���� ��
	
	public MysocketServer() throws Exception{
		vt = new Vector<>();					//���ν����� ���͸� ����
	 serverSocket  = new ServerSocket(3000);
	
	while(true) {                                         	//Socket socket ���μ����ؼ� ���θ���ٴ°�
		Socket socket = serverSocket.accept(); //��������  ��û�ް��� �ٸ��� ä�ý�Ŵ  
		System.out.println("��û�� ����");   //�׷��� ���ο� ������ �ʿ��� ����Ŭ�����θ���;;
		NewSocketThread nt = new NewSocketThread(socket); //���ϸ���� ���ο� ������ ����� ���ο���忡 ���Ͽ����Ŵ 
													//�ٽ� ���ƿͼ� ����� �� ������� ���ο� ������ ä�����ؾ��Ѵ�.
													//buffered write, reader �����ָ��
		Thread newWorker =  new Thread(nt);	   //Ÿ���� �ʿ�
		newWorker.start();		
		vt.add(nt); 							//nt�� ������ ����ִ�.
	}
	
	
	}
	
	
	//���ο� �����忡�� ���۸� ������ �� �ְ� socket�� ����!!
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
						System.out.println("Ŭ���̾�Ʈ:" + msg);
						if(newSocketThread != this) {
							newSocketThread.bw.write(msg);
							newSocketThread.bw.flush();
						}
						newSocketThread.bw.write(msg + "\n");	
						newSocketThread.bw.flush();  //buffer�� ������ �� ���� flush�������
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
