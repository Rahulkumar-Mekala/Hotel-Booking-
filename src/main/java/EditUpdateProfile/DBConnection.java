package EditUpdateProfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection connection ;
	private DBConnection() {
		// TODO Auto-generated constructor stub
	}
	static {
		
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 connection = DriverManager.getConnection(DBInfo.dburl,DBInfo.Uname,DBInfo.Upassword);
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getcon() {
		return connection;
		
	}

}
