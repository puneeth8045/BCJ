package com.crmindz.bcjMay2017.DAO.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.crmindz.bcjMay2017.JDBC.util;
import com.crmindz.bcjMay2017.Model.CustomerDetails;




public class RegistrationDAO {
	public static CustomerDetails registerCustomer(CustomerDetails cd){
		CustomerDetails cd1 = new CustomerDetails();
		int id1=0,id2=0;
		try{
			Connection con = util.getConnection();
			  String query1 = "insert into CustomerDetails(firstname, lastname, phoneNo, email)"+"values(?,?,?,?)";
			  PreparedStatement ps = con.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
			  ps.setString(1, cd.getFirstName());
			  ps.setString(2, cd.getLastName());
			  ps.setString(3, cd.getPhoneNo());
			  ps.setString(4, cd.getEmail());
			  ps.executeUpdate();
			  ResultSet rset = ps.getGeneratedKeys();
			  
			  if(rset.next()){
				  id1=rset.getInt(1);
			  }
			  
			  String query2 = "insert into loginDetails(username,password,accountNo,CustomerDetails_Customerid)"+"values(?,?,?,?)";
			  PreparedStatement ps1 = con.prepareStatement(query2,Statement.RETURN_GENERATED_KEYS);
			  ps1.setString(1, cd.getUsername());
			  ps1.setString(2, cd.getPassword());
			  ps1.setString(3, cd.getAccountNo());
			  ps1.setInt(4, id1);
			  
			  ps1.executeUpdate();
			  ResultSet rset1 = ps1.getGeneratedKeys();
			  
			  if(rset1.next()){
				  id2= rset1.getInt(1);
			  }
			  
			  PreparedStatement ps2 = con.prepareStatement("select username from loginDetails where username=?");
			  ps2.setString(1, cd.getUsername());
			  ResultSet rs = ps2.executeQuery();
			  
			  while(rs.next()){
				  cd1.setUsername(rs.getString("username"));
			  }con.close();
			  
		}catch(Exception e){
			System.out.println(e);
		}
		return cd1;
		
	}

}
