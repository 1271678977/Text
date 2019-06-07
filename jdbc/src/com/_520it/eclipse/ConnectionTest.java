package com._520it.eclipse;



import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class ConnectionTest {
	
	@Test
	public void testGetConn() throws Exception{
		User u=new User();
	
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
		String user = "root";
		String password = "nowmima";
		Connection conn = DriverManager.getConnection(url,user,password);
		System.out.println(conn);
	}
	

}
