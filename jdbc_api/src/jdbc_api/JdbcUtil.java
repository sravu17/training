package jdbc_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.cj.jdbc.Driver;

public class JdbcUtil {
	public static Connection getConnection() throws SQLException , Exception{
		/*
		 * String url = "jdbc:mysql://localhost:3306/java";
		 * //DriverManager.registerDriver(new Driver()); try {
		 * Class.forName("com.mysql.cj.jdbc.Driver"); } catch (ClassNotFoundException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } Connection conn
		 * =conn = DriverManager.getConnection(url, "root", "mysql@1234"); return conn;
		 */
FileReader reader = new FileReader("src/mysql.info");
Properties p = new Properties();
p.load(reader);

String url = p.getProperty("url");
Connection con = null;
Class.forName(p.getProperty("driver"));
con = DriverManager.getConnection(url,p.getProperty("user"),p.getProperty("password"));
return(con);




	
		}

	}


