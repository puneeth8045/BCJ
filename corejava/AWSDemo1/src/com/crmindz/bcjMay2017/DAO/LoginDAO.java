package com.crmindz.bcjMay2017.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.crmindz.bcjMay2017.JDBC.Util;
import com.crmindz.bcjMay2017.Model.AWSLoginCredentials;



public class LoginDAO {
	public static AWSLoginCredentials getLoginDetails(AWSLoginCredentials awss){
  	  ResultSet result= null;
  	AWSLoginCredentials awss1 = new AWSLoginCredentials();
  	  try{
  		  Connection con = Util.getConnection();
			  PreparedStatement ps = con.prepareStatement("select username,password from loginDetails where username=?");
			  ps.setString(1,awss.getUserName());
			  result = ps.executeQuery();
			  while(result.next()){
				  awss1.setUserName(result.getString("username"));
				  awss1.setPassword(result.getString("password"));
				  
			  }
			  
  	  }catch(Exception e){
  		  System.out.println(e);
  		  
  	  }
		return awss1;
  	  
    }
}
