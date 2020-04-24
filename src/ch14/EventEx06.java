package ch14;

import java.awt.Container;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventEx06 extends JFrame {
	int imgX = 290;
	int imgY = 20;  //전역임 힙이 관리함 (밑에 보면 new 있음)
	
	
	public EventEx06() {
		setTitle("장풍예제");
		setSize(700, 300);
		setLocationRelativeTo(null); // 프레임 화면 가운데 배치
		setContentPane(new MyPanel());
		setVisible(true);
	}
	//paint Component 함수는 JFrame 안에서 작동안함
	class MyPanel extends JPanel{
		
		public MyPanel() {
			setFocusable(true);		
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("keycode :" + e.getKeyCode());
					System.out.println("keychar :" + e.getKeyChar());
					switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT: //0x25 //16진수임 25 - > 37
						imgX = imgX - 10;
						break;
					case KeyEvent.VK_RIGHT: //0x27
						imgX = imgX + 10;
						break;
					
					case KeyEvent.VK_DOWN:
						imgY = imgY + 5;
						break;
					case KeyEvent.VK_UP:
						imgY = imgY - 5;
						break;
					
					case KeyEvent.VK_SPACE: // 0X20
					
						
						
						
						new Thread(new Runnable() {
							
							@Override
							public void run() {
								int time = 5;
								
								while(time > 0) { 
									imgX = imgX + 10;
									repaint();
									time--;
									try {
										Thread.sleep(100);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
									
								}
								
							}
						}). start();
						break;
					}
					repaint();
				
				}
			});
			}
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon imgRyu = new ImageIcon("img/ryu.png");
			ImageIcon imgpa = new ImageIcon("img/pa.png");
			
			// 이미지추출 
			Image ryu = imgRyu.getImage();
			Image pa = imgpa.getImage();
			
			g.drawImage(ryu, 0, 0, null);
			g.drawImage(pa, imgX, imgY, null);
		}
	}
	
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
	}
	
	public static void main(String[] args) {
		new EventEx06();
	}

}
