package ch14;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PRIVATE_MEMBER;

public class GrapichsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GrapichsDrawImageEx1() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 420);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("img/pa.png");
		private Image img = icon.getImage(); //이미지 객체
		
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			//이미지를 패널의(20, 20)에 원래 크기로 그린다.
			g.drawImage(img, 20, 20, this);
		}
		
	}
	
	public static void main(String[] args) {
		new GrapichsDrawImageEx1();
		
		
	}

}
