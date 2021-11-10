package jdbc_api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsertDemo {
	public static void main(String[] args) throws Exception {
		String sql = "insert into people values(?,?,?)";
		Connection conn = null;
		
		String name = "Shrey";
		int age = 25;
		String city = "NewYork";
		
		try {
			conn=JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, city);
			stmt.executeUpdate();
			System.out.println("Record inserted..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
