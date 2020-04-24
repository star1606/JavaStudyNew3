package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx02 extends JFrame {
	public SwingEx02() {
		setTitle("ContentPane�� JFrame"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����Ӵݱ�â ������ 
														//���α��� ����ǰ��ϴ°�
		
		Container contentPane = getContentPane(); // ����Ʈ ���� �˾Ƴ���.
		contentPane.setBackground(Color.ORANGE); //  ����Ʈ���� ���� ������ ������
		contentPane.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK")); // OK ��ư�ޱ�
		contentPane.add(new JButton("Cancel")); // Cancel ��ư�ޱ�
		contentPane.add(new JButton("Ignore")); // Ignore ��ư�ޱ�
		
		setSize(300, 150); //������ ũ�� 300x150����
		setVisible(true); //ȭ�鿡 ������ ���
		
		
	}
	
	
		
	
	public static void main(String[] args) {
		new SwingEx02();
	}

}
