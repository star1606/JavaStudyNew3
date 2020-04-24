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
													//서버소켓의 accept()함수를 호출
		bw   
	    	= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		br //앞에 bufferedreader 지워야지 됨 왜냐하면 지역변수로 선언이 되니까 전역변수 위에 만들어놓음 전체써먹게
			= new BufferedReader(new InputStreamReader(System.in));  //키보드로 입력 받는다
		
		String msg = "";
		while((msg = br.readLine()) != null ) {
		bw.write(msg + "\n"); //메세지읽어오고 메세지가 null이 아니면 write로 입력씀
		System.out.println("내메세지 :" + msg);
		bw.flush();     
		}
		
		bw.close();
		br.close();
		socket.close();
		
		socket.close();
	}	//bufferedwriter 기능 있는거 //autoflush true, false로 정함
	
	public static void main(String[] args) {
		
			try {
				new MySocketClient();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
