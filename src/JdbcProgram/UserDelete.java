package JdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UserDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prabhu","root","T#9758@qlph");
		Statement st=con.createStatement();
		st.execute("delete from user where id=2 ");
		con.close();
		
		System.out.println("data deleted");
	}
}
