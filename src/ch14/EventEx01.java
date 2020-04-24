package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class EventEx01 extends JFrame{
	
	public EventEx01() {
		setTitle("Action �̺�Ʈ ������ ����");
		//�̺�Ʈ �й轺���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//����Ʈ�гο� ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//������ ����
		btn.addActionListener(new MyActionListener());	//�����ʴ� add�� ������
		c.add(btn);
		setSize(350,150);
		setVisible(true);  // paint() �Լ� ȣ��
	}

	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else {
				b.setText("Action");
			}
		}
	}
	
	public static void main(String[] args) {
		new EventEx01();
	}
}