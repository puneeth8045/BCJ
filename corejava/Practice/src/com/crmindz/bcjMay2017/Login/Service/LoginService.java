package com.crmindz.bcjMay2017.Login.Service;

import com.crmindz.bcjMay2017.Login.DAO.LoginDAO;
import com.crmindz.bcjMay2017.Login.model.LoginCredentails;

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
