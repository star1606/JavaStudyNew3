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

	private JButton b1, b2, b3; // 힙으로 관리함

	public JComponentEx() 
	{
		setTitle("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		b1 = new JButton("Magenta/Yellow Button");
		b2 = new JButton("   Disabled Button   ");
		b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.YELLOW); // 배경색 설정 , 백그라운드
		b1.setForeground(Color.MAGENTA); // 글자색 설정, 포그라운드
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
		b2.setEnabled(false); // 버튼비활성화
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JButton b = (JButton) e.getSource(); 
				// Object를 리턴하기 때문에 다운 캐스팅 - 언마셜링임
				// 언마샬링, 직렬화의 차이
				//JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
				//frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표출력
				b3.setText("hello");
				//버튼을 클릭했을지 체크박스일지 잘모르니까 너가 직접 다운캐스팅해라
				//해당버튼에 접근할 수 있다
				
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3); // 컨탠트팬에 버튼부착

		setSize(260, 200);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new JComponentEx();

	}

}
