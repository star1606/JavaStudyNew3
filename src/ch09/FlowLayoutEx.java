package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //메인도 종료되게
		Container c = getContentPane();
		
		//컨텐트팬에 FlowLayout 배치관리자 설정
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//setLayout 안해주면 default 가 border라 이상하게 됨
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200); //프레임 크기 300x200 설정
		setVisible(true); //화면에 프레임 출력
	
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
