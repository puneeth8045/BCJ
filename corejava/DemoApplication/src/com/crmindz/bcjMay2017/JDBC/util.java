package com.crmindz.bcjMay2017.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class util {
	static Connection con;
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			String name = "root";
			String password = "root";
			con = DriverManager.getConnection(url, name, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
		
	}

}
