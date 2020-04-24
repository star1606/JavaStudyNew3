package ch15;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import org.omg.CORBA.portable.UnknownException;

public class MySocketClient {

	
	Socket socket;
	BufferedWriter bw;
	BufferedReader br;   
	
	public MySocketClient() throws Exception {
		socket = new Socket("localhost", 15000);    //local host = "127.0.0.1"
													//���������� accept()�Լ��� ȣ��
		bw   
	    	= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		br //�տ� bufferedreader �������� �� �ֳ��ϸ� ���������� ������ �Ǵϱ� �������� ���� �������� ��ü��԰�
			= new BufferedReader(new InputStreamReader(System.in));  //Ű����� �Է� �޴´�
		
		String msg = "";
		while((msg = br.readLine()) != null ) {
		bw.write(msg + "\n"); //�޼����о���� �޼����� null�� �ƴϸ� write�� �Է¾�
		System.out.println("���޼��� :" + msg);
		bw.flush();     
		}
		
		bw.close();
		br.close();
		socket.close();
		
		socket.close();
	}	//bufferedwriter ��� �ִ°� //autoflush true, false�� ����
	
	public static void main(String[] args) {
		
			try {
				new MySocketClient();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
