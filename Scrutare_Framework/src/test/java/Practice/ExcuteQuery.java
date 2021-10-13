package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExcuteQuery {

	@Test
	public void excutequery() throws Throwable {
		//step1:register the database
		Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		//step 2:establish connection with database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
		//step 3:issue create statement
		Statement stat = con.createStatement();
		//excute the query
		ResultSet result = stat.executeQuery("select * from customer;");
		//System.out.println(result);
		while(result.next()) {
		
			System.out.println(result.getString(2));
		}
	}
}
