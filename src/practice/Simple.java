package practice;

import java.sql.*;

/* 1.import java.sql package
 * 2. load and register the driver-->com.mysql.jdbc.driver
 * 3.create connection
 * 4.create statement
 * 5.execute query
 * 6.process to result
 * 7 close
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Simple {
	public static void main(String[] args) throws Exception
	{   
		String url="jdbc:mysql://localhost:3306//student";
		String uname="root";
		String pass=" ";
		String query ="select username from student where userid=3";
		
		Class.forName("	com.mysql.jdbc.Driver");                        //load driver
		Connection con=DriverManager.getConnection(url,uname,pass);    //create connection
		Statement st= con.createStatement();                          //create statement 
		ResultSet rs = st.executeQuery(query);                       //execute query
		
		String name = rs.getString("username");
		System.out.println(name);
		
		st.close();
		con.close();                                        //close the connection
	}

}
