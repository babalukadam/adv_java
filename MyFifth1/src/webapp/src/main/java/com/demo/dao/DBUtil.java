package com.demo.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	static
	{
		conn=null;
	}
	static Connection getMyConnection() 
	{
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost/webjava?useSSL=false";
				String uname="root";
				String pass="babalu123";
				conn=DriverManager.getConnection(url,uname,pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn ;
	}
	static void closeMyConnection()  
	{
		try {
			conn.close();
		}
		catch(SQLException e)
		{
			e.getStackTrace();
		}
	}
}
