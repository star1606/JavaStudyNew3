package ch16;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectEx01 {
	// �����ͺ��̽� �����Ұǵ� JDBC����̹�ȣ���Ұ���

	public static void main(String[] args) {
		try {
			final String SQL = "select id, name, email, password from users"; // �� �ۿø�

			Class.forName("oracle.jdbc.driver.OracleDriver"); // OJDBC ������ �ش� ����̹��� �ε��ض�� �޴����� ����.

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang",
					"c##madang");
			// ��Ʈ�� ����

			PreparedStatement pstmt = conn.prepareStatement(SQL);// ���۸� �޾Ҵ�.
			// ?�� ����ϰ� ���ش�
			// ?�� ����ϰ� ���ش�
			// �Ľ��� �� ���� ��, �����ǰ����� �����ش�
			pstmt.executeQuery(); // ���ۿ� ���� - ResultSet�� ���Ϲ���!!
			ResultSet rs = pstmt.executeQuery();
			List<Users> users = new ArrayList<>();
			while (rs.next()) { // if�� �ȵ� �� �ۿ÷����ϴϱ�
				Users user = new Users(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("password"));

				users.add(user);

			}

			for (Users user : users) {
				System.out.println(user.getId()); // �÷����°� ���� ������������
				System.out.println(user.getName());
				System.out.println(user.getEmail());
				System.out.println(user.getPassword());
				System.out.println("����Ʈ �Ϸ�"); // �ڹٿ�����Ʈ�� �����ؾ� �������� (������Ʈ�������� �÷���) //select �� execute����ȴ�(��ȭ�� �����ϱ�)
			}

			// delete,update�� excuteUpdate �Ἥ commit���ؾߵȴ� (�ֳ��ϸ� ������ �����ϱ� Ŀ���ؾ���)
		} catch (Exception e) {

			e.printStackTrace();
		}
		// heap�� Oracle Driver ����, static���� ȣ��ȴ�
		// ����̹� �Ŵ��� Ŭ������ ��� �ִ� static���� ���
		// Oracle driver�̿��ؼ� stram �����Ѵ�(�������̽�����־)
		// Driver Manager�� get connection���� �ּ�ã���ش� conn => stream
		// ���� �������ʰ� class forname���� �ϴµ� �ּҸ� �𸣴µ� driver manager�� �ִ� get�Լ��� ȣ���ϸ�
		// ���Ϲ����� stream(���)�ȴ�.
	}

	// ��� ����̹��Ŵ����� ����Ŭ ����̹��� ã�¤���
}

// DB�� ������ ������ parser�� compile��

// JDBC�� �������̽��̴� ������ϴµ� ���������ִ�

// preparedstatement : �����ǰ��� ���� (or ������, �ּ�ó��), ����Ľ��� �Ѵ�

// DBMS���� resultset Ÿ���� �������� resultset �� Ŀ��
// Ŀ���� �������ش� => ���۷����ּҸ� �������ش�.
// �ڹٿ��� ����rs�� �޴´� [����� �ƴ϶� ����� ����Ű�� Ŀ����]
// ���̽��� ���Ϲ��� �ʰ� Ŀ���� ���Ϲ޴´�
//
