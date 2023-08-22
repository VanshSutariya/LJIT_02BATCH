package statement_interface;
import java.sql.*;

public class DBUT {
	private static Connection conn;
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Database@123";
	private static final String DBURL = "jdbc:mysql://localhost:3306/jdbc";
	public static Connection getConnection() {
		try {
			Class.forName(DRIVERCLASS);
			conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error"+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		return conn;
		
	}
}
