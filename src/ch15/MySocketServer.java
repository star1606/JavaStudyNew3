package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


//��������: ������ ��û�޴°�
public class MySocketServer {

	ServerSocket serverSocket; //�����ߴ�
	Socket socket;
	BufferedReader br;
	
	public MySocketServer() throws Exception {

		
			serverSocket = new ServerSocket(15000); //���� ���� ���� (������ �޴�)
			socket = serverSocket.accept();         //��û�� ��� (while���鼭 ������Գ� Ȯ���� )
		    System.out.println("��û�� ����");	//����Ǹ� ������ ����;
		
			
			 br = //�տ� bufferedreader �������� �� �ֳ��ϸ� ���������� ������ �Ǵϱ� �������� ���� �������� ��ü��԰�
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String msg = "";
			while((msg=br.readLine()) != null) {
				System.out.println("���� : " + msg);
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
