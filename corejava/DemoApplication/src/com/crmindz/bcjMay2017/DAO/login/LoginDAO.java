package com.crmindz.bcjMay2017.DAO.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.crmindz.bcjMay2017.JDBC.util;
import com.crmindz.bcjMay2017.Model.LoginCredentails;



public class LoginDAO {
	public static LoginCredentails getLoginDetails(LoginCredentails lc){
    	  ResultSet result= null;
    	  LoginCredentails lc1 = new LoginCredentails();
    	  try{
    		  Connection con = util.getConnection();
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
