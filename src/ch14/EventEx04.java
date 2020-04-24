package ch14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx04 extends JFrame {

	private JLabel la;
	public EventEx04() {
		la = new JLabel("Hello");
		setTitle("MouseEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이벤트 분배 스레드끔
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //ctrl + space했을때 매개변수 L이면 인터페이스임
		c.setLayout(null); // absoulte 레이아웃
		la.setSize(50, 20); // 라벨의 사이즈
		la.setLocation(30, 30); // 라벨의 위치
		c.add(la);
		setSize(250, 250);
		setVisible(true); // paint
	}
	
	class MyMouseListener extends MouseAdapter { //추상메서드 5개가지고 있음
		//오버라이드 쓸데 없이 많아서 MouseAdapter로 걸러준다(추상클래스를 다 구현해놈)
		@Override  //어댑터를 쓰면서 원하는 것만 오버라이딩할 수 있게함 대신 직접찾을 수 있어야함
		public void mousePressed(MouseEvent e) { //마우스를 클릭하고 땠을 때
			int x = e.getX(); // x좌표
			int y = e.getY(); // y좌표
			la.setLocation(x, y); // 라벨 위치 변경. => repaint()
			}
	}
	
	public static void main(String[] args) {
		new EventEx04();

	}

}
