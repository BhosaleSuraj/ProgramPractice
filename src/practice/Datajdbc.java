package practice;
import java.sql.*;
public class Datajdbc {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.MySql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","2828");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select*from studenti where userid=2");
		rs.next();
		int id=rs.getInt("userid");
		String name=rs.getString("username");
		System.out.println(id+"   "+ name);
		st.close();
		con.close();
	}

}


//class.forname -> load the driver
//create connection  using a get connection method using driver manager class

