package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx02 extends JFrame {
	public SwingEx02() {
		setTitle("ContentPane과 JFrame"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임닫기창 누르면 
														//메인까지 종료되게하는거
		
		Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다.
		contentPane.setBackground(Color.ORANGE); //  컨텐트팬의 색을 오렌지 색으로
		contentPane.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("OK")); // OK 버튼달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼달기
		
		setSize(300, 150); //프레임 크기 300x150설정
		setVisible(true); //화면에 프레임 출력
		
		
	}
	
	
		
	
	public static void main(String[] args) {
		new SwingEx02();
	}

}
