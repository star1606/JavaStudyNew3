package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ε� ����ǰ�
		Container c = getContentPane();
		
		//����Ʈ�ҿ� FlowLayout ��ġ������ ����
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//setLayout �����ָ� default �� border�� �̻��ϰ� ��
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200); //������ ũ�� 300x200 ����
		setVisible(true); //ȭ�鿡 ������ ���
	
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
