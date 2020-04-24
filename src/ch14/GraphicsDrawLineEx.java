package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch14.EventEx06.MyPanel;

public class GraphicsDrawLineEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineEx() {
		setTitle("drawline 사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 170);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); // 빨간색 선택
			g.drawLine(20, 20, 100 ,100); //선 그리기
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
