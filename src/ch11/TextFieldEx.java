package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	private JTextField tf;
	private JTextArea ta;
	
	
	
	
	
	public TextFieldEx() {
	 setTitle("텍스트, 에디터, 텍스트 박스 연습");
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 Container c = getContentPane();
	 tf = new JTextField("", 200);
	 tf.setFont(new Font("Arial", Font.BOLD, 150));
	
	 
	 ta = new JTextArea("", 100, 50);
	 ta.setBackground(Color.ORANGE);
	 ta.setEnabled(false);
	 
	 tf.addKeyListener(new KeyAdapter() {
		 @Override
		public void keyPressed(KeyEvent e) {
			 if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			 String value = tf.getText();
			 ta.append(value+ "\n");
			
			 tf.setText("");
			 }
			
			 
		}
		 
	});
	 tf.setPreferredSize(new Dimension(100, 100));
	 //x,y위치찍음
	c.add(tf, BorderLayout.SOUTH);
	c.add(ta, BorderLayout.CENTER);
	
	ta.setEnabled(false);
	setSize(400, 500);
	setVisible(true);
	
	
	
	
	}
	public static void main(String[] args) {
		new TextFieldEx();

	}

}
