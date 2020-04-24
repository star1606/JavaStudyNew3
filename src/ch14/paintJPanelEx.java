package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch14.EventEx06.MyPanel;

public class paintJPanelEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public paintJPanelEx() {
		setTitle("JPanel paintcomponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // 생성한 panel 패널을 컨텐트 팬으로 사용
		setSize(250, 220);
		setVisible(true);
	}
	
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // Jpanel의 paintComponent()호출
			g.setColor(Color.BLUE); //파란색 선택
			g.drawRect(10,10,50,50); // (10,10) 위치에 50x50크기의 사각형 그리기
			g.drawRect(50,50,50,50); // (50,50) dnlcldp 50x50 크기의 사각형 그리기
			g.setColor(Color.MAGENTA); // 마젠타색 선택
			g.drawRect(90,90,50,50); // (90,90)위치에 50x50 크기의 사각형 그리기
		}
	}
	
	
	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
