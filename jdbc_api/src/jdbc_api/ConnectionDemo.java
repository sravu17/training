package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javatraining";
		Connection conn = null;

		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url, "root", "mysql@1234");
			System.out.println("Connected Succefully..");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
