package com.crm.vtiger.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {
Connection con=null;
Driver driverRef=null;
public void connectToDB() throws Throwable {
	DriverManager.registerDriver(driverRef);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
}
public void closeDB() throws Throwable {
	con.close();
}
}
