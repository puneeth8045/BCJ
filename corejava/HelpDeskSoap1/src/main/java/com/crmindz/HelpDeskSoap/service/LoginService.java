package com.crmindz.HelpDeskSoap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.HelpDeskSoap.dao.HelpDeskDao;
import com.crmindz.HelpDeskSoap.domain.LoginCredentails;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;


/**
 * @author Puneeth This Class implements methods to generate business logic
 *         wherever required.
 */
@Service
public class LoginService {
	
	String Student;
	String Employee;
	
	@Autowired
	HelpDeskDao helpDeskDao;

	/**
	 * @param login
	 * @return String This method takes user entity class and sends its to DAO class
	 *         for validation.
	 */
	public String validateUser(LoginCredentails login) {

		List<LoginCredentails> lc = helpDeskDao.getLoginDetails(login);
		if (lc.isEmpty()) {
			return "Username is incorrect!!!!";
		}

		else if (login.getPassword().equals(lc.get(0).getPassword())) {
			return lc.get(0).getUsertype();
		}

		else {
			return "Password is incorrect!!!";
		}

	}

	/**
	 * @param username
	 * @return List This method returns the list used in jqGrid.
	 */
	public List<TicketCreation> gridView(String username) {
		List<TicketCreation> lc = helpDeskDao.getGrid(username);

		return lc;

	}

}
