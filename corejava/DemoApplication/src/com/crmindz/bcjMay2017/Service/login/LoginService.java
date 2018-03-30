package com.crmindz.bcjMay2017.Service.login;

import com.crmindz.bcjMay2017.DAO.login.LoginDAO;
import com.crmindz.bcjMay2017.Model.LoginCredentails;

public class LoginService {
	public static boolean authenticateLogin(LoginCredentails lc){
		LoginCredentails getDetails = LoginDAO.getLoginDetails(lc);
		if(lc.getUserName().equals(getDetails.getUserName())){
			lc.getPassword().equals(getDetails.getPassword());
			return true;
		}else{
			return false;	
		}
		
		
	}

}
