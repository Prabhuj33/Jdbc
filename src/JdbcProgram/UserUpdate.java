package JdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prabhu","root","T#9758@qlph");
	
	   Statement st=con.createStatement();
	   st.execute("update user set name='Ramya' where id=1 ");
	   con.close();
	   System.out.println("data update sucessfully");
	
	}
}
