package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx01 { 
	//�����ͺ��̽� �����Ұǵ� JDBC����̹�ȣ���Ұ���

	public static void main(String[] args) {
		try {
			final String SQL = "update users set password = ? where id = ?";
		
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); //OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "c##madang");           
			//��Ʈ�� ����
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۸� �޾Ҵ�.
			pstmt.setString(1, "5678");										 // ?�� ����ϰ� ���ش�
			pstmt.setInt(2, 2);										 // ?�� ����ϰ� ���ش�
				  				     				// �Ľ��� �� ���� ��, �����ǰ����� �����ش�
			pstmt.executeUpdate(); //���ۿ� ����(commit�� ����)
			System.out.println("������Ʈ �Ϸ�");	//select �� execute����ȴ�(��ȭ�� �����ϱ�)  
												//delete,update�� excuteUpdate �Ἥ commit���ؾߵȴ� (�ֳ��ϸ� ������ �����ϱ� Ŀ���ؾ���) 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    // heap�� Oracle Driver ����, static���� ȣ��ȴ�
	    //����̹� �Ŵ��� Ŭ������ ��� �ִ� static���� ���
		//Oracle driver�̿��ؼ� stram �����Ѵ�(�������̽�����־)
		//Driver Manager�� get connection���� �ּ�ã���ش� conn => stream
		//���� �������ʰ� class forname���� �ϴµ� �ּҸ� �𸣴µ� driver manager�� �ִ� get�Լ��� ȣ���ϸ�
		//���Ϲ����� stream(���)�ȴ�.
	}  
	
		//��� ����̹��Ŵ����� ����Ŭ ����̹��� ã�¤���
}

		//DB�� ������ ������  parser�� compile��

		//JDBC�� �������̽��̴� ������ϴµ� ���������ִ�
