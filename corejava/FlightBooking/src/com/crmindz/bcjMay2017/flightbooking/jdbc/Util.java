package com.crmindz.bcjMay2017.flightbooking.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	static Connection connect;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			String name = "root";
			String password = "root";

			connect = DriverManager.getConnection(url, name, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connect;
	}

}
