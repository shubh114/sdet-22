package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExcuteUpdate {
	Connection con=null;
	@Test
	public void excuteupdate() throws Throwable {
		//step1:register the database
		try{			Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		//step 2:establish connection with database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
		//step 3:issue create statement
		Statement stat = con.createStatement();
		//excute the query
		 int result = stat.executeUpdate("insert into customer values('3','shubham','gupta','ambikapur');");
		 if(result==1) {
			 System.out.println("project is created successfully");
		 }else
			 System.out.println("queryfailed");
}
		catch(Exception e) {
			
		}
		finally {
			con.close();
		}
	}
	
}
