package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame 
{

	private JButton b1, b2, b3; // ������ ������

	public JComponentEx() 
	{
		setTitle("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		b1 = new JButton("Magenta/Yellow Button");
		b2 = new JButton("   Disabled Button   ");
		b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.YELLOW); // ���� ���� , ��׶���
		b1.setForeground(Color.MAGENTA); // ���ڻ� ����, ���׶���
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20�ȼ� ��Ʈ ����
		b2.setEnabled(false); // ��ư��Ȱ��ȭ
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JButton b = (JButton) e.getSource(); 
				// Object�� �����ϱ� ������ �ٿ� ĳ���� - �𸶼ȸ���
				// �𸶼���, ����ȭ�� ����
				//JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
				//frame.setTitle(b.getX() + "," + b.getY()); // Ÿ��Ʋ�� ��ư ��ǥ���
				b3.setText("hello");
				//��ư�� Ŭ�������� üũ�ڽ����� �߸𸣴ϱ� �ʰ� ���� �ٿ�ĳ�����ض�
				//�ش��ư�� ������ �� �ִ�
				
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3); // ����Ʈ�ҿ� ��ư����

		setSize(260, 200);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new JComponentEx();

	}

}
