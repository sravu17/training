package jdbc_api;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordDemo {
	public static void main(String[] args) throws Exception {
		String sql = "insert into people values('Sara',23,'Hyderabad')";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
