package prepareStatmentInterface;
import java.sql.*;

public class prepareStatmentDemo {
	static Connection conn;
	static PreparedStatement pstmt;
	static {
		conn = DBUT.getConnection();
		if(conn != null) {
			System.out.println("Connected");
		}
	
	}
	public static int addStudent(int id,String name) {
		int number = 0;
		try {
			pstmt = conn.prepareStatement("insert into stu_1 values(?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			number = pstmt.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		return number;
	}
	
	
	public static void showStudent() {
		
		try {
			String query = "select * from stu_1";
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			if(rs.next()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
			}
			rs.close();
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}

	}
}

