package JdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInsert 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prabhu","root","T#9758@qlph");
Statement st=con.createStatement();
st.execute("insert into user values(3,'kannaki','kovai')");
con.close();
System.out.println("data insert successfully");
}

}

