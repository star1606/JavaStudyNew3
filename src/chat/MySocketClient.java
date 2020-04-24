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
		Thread newWorker = new Thread(rt);  //Ÿ�� ���ؼ� �־������
		newWorker.start();
		
		BufferedWriter bw =
		new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		BufferedReader keyboardIn =					//reader �ΰ��ʿ��� 
		new BufferedReader(new InputStreamReader(System.in));
																//������ Ű���� �޴°�
		String outputMsg = "";
		
		//���ο� �����常��°� while����
		
		//���� ������� ���⼭ ���ѷ���
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
						System.out.println("����:" + inputMsg);
					}
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				
			}
		}
	
	
	
	
	//��ε�ĳ���� " �������� �� ������ ������ �ڱⰡ ������ �� ������ ���ϴ°�
	//�����ϴ¹���� �������� �ɷ����� �����°� (����������)
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

}
