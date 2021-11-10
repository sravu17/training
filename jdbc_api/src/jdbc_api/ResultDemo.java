package jdbc_api;

import java.sql.Statement;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {
public static void main(String[] args) throws Exception {
	String sql = "select * from people";
	
	try {
		Connection conn = JdbcUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cc = rsmd.getColumnCount();
		System.out.println(cc);
		
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString("age")+"\t"+rs.getString(3));
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}


}
