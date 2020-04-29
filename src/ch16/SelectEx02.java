package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx02 { 
	//�����ͺ��̽� �����Ұǵ� JDBC����̹�ȣ���Ұ���

	public static void main(String[] args) {
		try {
			final String SQL = "select id, name, email, password from users where id = ?";
		
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); //OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "c##madang");           
			//��Ʈ�� ����
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);//���۸� �޾Ҵ�.
			pstmt.setInt(1, 3);													 // ?�� ����ϰ� ���ش�
												     // ?�� ����ϰ� ���ش�
															     				// �Ľ��� �� ���� ��, �����ǰ����� �����ش�
			pstmt.executeQuery(); //���ۿ� ���� - ResultSet�� ���Ϲ���!!
			ResultSet rs = pstmt.executeQuery();
			Users users = null;
			if(rs.next()) {
				users = new Users(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("password")
						);
						
						
				System.out.println(rs.getInt("id")); //�÷����°� ���� ������������
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("password"));
				System.out.println("����Ʈ �Ϸ�"); 		// �ڹٿ�����Ʈ�� �����ؾ� �������� (������Ʈ�������� �÷���)
				
			}
												//select �� execute����ȴ�(��ȭ�� �����ϱ�)  
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

		//preparedstatement : �����ǰ��� ���� (or ������, �ּ�ó��), ����Ľ��� �Ѵ�


		//DBMS���� resultset Ÿ���� �������� resultset �� Ŀ��
		//Ŀ���� �������ش� => ���۷����ּҸ� �������ش�.
		// �ڹٿ��� ����rs�� �޴´� [����� �ƴ϶� ����� ����Ű�� Ŀ����]
		// ���̽��� ���Ϲ��� �ʰ� Ŀ���� ���Ϲ޴´�
 		// 


