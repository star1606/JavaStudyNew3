package ch13;


// OS는 Runnable 타입의 heap 공간에 run 메서드를 호출해야한다는 걸 이미 알고 있음.
class Sub implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("서브 쓰레드 :" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}



public class ThreadEx01 {

	
	//메인 쓰레드
	public static void main(String[] args) {
	    Sub s = new Sub();
		Thread t1 = new Thread(s);
		t1.start();
		
		for (int i = 1; i < 6; i++) {
		 System.out.println("메인 쓰레드:" + i);
		 try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		// 1초동안 잠을자라
	}	//잠을 방해 : 간섭 받을 수 있어서 try catch필요

	}

}
