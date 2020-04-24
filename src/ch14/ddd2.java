package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch14.EventEx06.MyPanel;

public class ddd2 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	int panelX = 600;
	int panelY = 600;
	int y = 200;
	int a = 50;
	int b  = 150;
	int c = 70;
	int width = 30; 
	int date = 4;
	
	public ddd2() {
		setTitle("しせしせしせ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
	
		
		setSize(panelX, panelY);
		setVisible(true);
	}
	
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			g.setColor(Color.BLUE);
			
			g.drawString(Integer.toString(date), (int)(panelX*0.2), (int)(panelY*0.9)+y+20);
			g.drawString(Integer.toString(date+1), (int)(panelX*0.4), (int)(panelY*0.9)+y+20);
			g.drawString(Integer.toString(date+2), (int)(panelX*0.6), (int)(panelY*0.9)+y+20);
			
			g.drawString("30", (int)(panelX*0.2),  (int)(panelY*0.9)-a-20);
			g.drawString("100", (int)(panelX*0.4), (int)(panelY*0.9)-b-20);
			g.drawString("70", (int)(panelX*0.6), (int)(panelY*0.9)-c-20);
			
			
			g.fillRect((int)(panelX*0.2), (int)(panelY*0.9)-a, width, y+a  );
			g.fillRect((int)(panelX*0.4), (int)(panelY*0.9)-b, width, y+b  );
			g.fillRect((int)(panelX*0.6), (int)(panelY*0.9)-c, width, y+c  );
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new ddd2();
		
		
	}

}
