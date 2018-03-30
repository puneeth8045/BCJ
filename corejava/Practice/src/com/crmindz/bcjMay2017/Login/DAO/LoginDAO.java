package com.crmindz.bcjMay2017.Login.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.crmindz.bcjMay2017.Login.model.LoginCredentails;

public class LoginDAO {
	public static LoginCredentails getLoginDetails(LoginCredentails lc){
    	  ResultSet result= null;
    	  LoginCredentails lc1 = new LoginCredentails();
    	  try{
    		  Class.forName("com.mysql.jdbc.Driver");
    		  String url = "jdbc:mysql://localhost:3306/mydb";
  			  String name = "root";
  			  String password = "root";
  			
  			  Connection con=DriverManager.getConnection(url, name, password);
  			  PreparedStatement ps = con.prepareStatement("select username,password from loginDetails where username=?");
  			  ps.setString(1,lc.getUserName());
  			  result = ps.executeQuery();
  			  while(result.next()){
  				  lc1.setUserName(result.getString("username"));
  				  lc1.setPassword(result.getString("password"));
  				  
  			  }
  			  
    	  }catch(Exception e){
    		  System.out.println(e);
    		  
    	  }
		return lc1;
    	  
      }
}
