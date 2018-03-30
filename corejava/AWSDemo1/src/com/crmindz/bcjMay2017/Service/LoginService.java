package com.crmindz.bcjMay2017.Service;

import com.crmindz.bcjMay2017.DAO.LoginDAO;
import com.crmindz.bcjMay2017.Model.AWSLoginCredentials;

public class LoginService {
	public static boolean authenticateLogin(AWSLoginCredentials awss){
		AWSLoginCredentials getDetails = LoginDAO.getLoginDetails(awss);
		if(awss.getUserName().equals(getDetails.getUserName())){
			awss.getPassword().equals(getDetails.getPassword());
			return true;
		}else{
			return false;	
		}
		
		
	}
}
