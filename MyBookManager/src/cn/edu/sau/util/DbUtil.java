package cn.edu.sau.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ���ݿ����ӹ�����
 * */
public class DbUtil {
	private String dbUrl = "jdbc:mysql://localhost:3306/db_book";

	private String dbUserName = "root";

	private String dbUserPassword = "123456";

	private String jdbcName = "com.mysql.jdbc.Driver";

	/**
	 * ��ȡ���ݿ������
	 * 
	 * @return ���ݿ����Ӷ���
	 * @throws Exception
	 */
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName,
				dbUserPassword);
		return con;
	}

	/**
	 * �ر����ݿ�����
	 * 
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception {
		if (con != null) {
			con.close();
		}
	}

	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
