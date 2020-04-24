package ch14;

import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class EventEx02 extends JFrame implements ActionListener{
	
	EventEx02 ex02;
	
	public EventEx02() {
		setTitle("Action �̺�Ʈ ������ ����");
		//�̺�Ʈ �й轺���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//����Ʈ�гο� ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//������ ����
		btn.addActionListener(this);	//�����ʴ� add�� ������
										//this �� ���� ����Ŵ
		c.add(btn);
		setSize(350,150);
		setVisible(true);  // paint() �Լ� ȣ��
	}//end of ������

	
	
	public static void main(String[] args) {
		new EventEx02();
	}


	//Ÿ�� (EventEx02 �� ������ ����)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ưŬ����");
		
	}
}