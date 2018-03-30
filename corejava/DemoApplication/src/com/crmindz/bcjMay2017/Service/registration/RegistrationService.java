package com.crmindz.bcjMay2017.Service.registration;

import com.crmindz.bcjMay2017.DAO.registration.RegistrationDAO;
import com.crmindz.bcjMay2017.Model.CustomerDetails;

public class RegistrationService {
	private static String getRandomNumber(int n) {
		int m = (int) (Math.random() * n + 1);
		return Integer.toString(m);
	}
	public static CustomerDetails RegisterCustomerAcct(CustomerDetails cd){
		cd.setAccountNo(getRandomNumber(100000));
		CustomerDetails cd1 = RegistrationDAO.registerCustomer(cd);
		return cd1;
		
	}

}
