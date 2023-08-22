package statement_interface;
import java.sql.*;

public class statementInterfaceDemo {
	
	static Connection conn;
	static Statement stmt;
	static {
		conn = DBUT.getConnection();
		try {
			stmt = conn.createStatement();
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
	}
	public static void showStudent() {
		try {
			String query = "select * from stu_1";
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
			}
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		
	}
	public static int addStudent(int id,String name) {
		int number = 0;
		try {
			String query = "INSERT INTO stu_1 VALUES(" +id+ ",' " +name+"')";
			number = stmt.executeUpdate(query);
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());

		}
		return number;
	}
	public static boolean updateStudent(int id,String name) {
		boolean flag = false;
		try {
			String query = "update stu_1 set stu_name='"+name+"'where studentid="+id;
			stmt.executeUpdate(query);
			flag = true;
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		return flag;
	}
	public static boolean deleteStudent(int id) {
		boolean flag = false;
		try {
			int number = validStudent(id);
			if(number == 1) {
				String query = "delete from stu_1 where studentid="+id;
				stmt.executeUpdate(query);
				flag = true;
			}
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		return flag;
	}
	public static int validStudent(int id) {
		int number = 0;
		try {
			String query = "select count(*) from stu_1 where studentid="+id;
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				if(rs.getInt(1)!=0) {
					number = 1;
				
				}
			}
		}
		catch(SQLException e) {
			System.out.println("Error"+e.getMessage());
		}
		return number;
	}
}
