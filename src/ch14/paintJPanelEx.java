package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch14.EventEx06.MyPanel;

public class paintJPanelEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public paintJPanelEx() {
		setTitle("JPanel paintcomponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // ������ panel �г��� ����Ʈ ������ ���
		setSize(250, 220);
		setVisible(true);
	}
	
	//JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // Jpanel�� paintComponent()ȣ��
			g.setColor(Color.BLUE); //�Ķ��� ����
			g.drawRect(10,10,50,50); // (10,10) ��ġ�� 50x50ũ���� �簢�� �׸���
			g.drawRect(50,50,50,50); // (50,50) dnlcldp 50x50 ũ���� �簢�� �׸���
			g.setColor(Color.MAGENTA); // ����Ÿ�� ����
			g.drawRect(90,90,50,50); // (90,90)��ġ�� 50x50 ũ���� �簢�� �׸���
		}
	}
	
	
	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
