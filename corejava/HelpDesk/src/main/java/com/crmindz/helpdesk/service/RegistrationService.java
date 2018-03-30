package com.crmindz.helpdesk.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.helpdesk.dao.HelpDeskDao;
import com.crmindz.helpdesk.domain.Registration;

/**
 * @author Puneeth This Class implements methods to generate business logic
 *         wherever required.
 */
@Service
public class RegistrationService {

	@Autowired
	HelpDeskDao helpDeskDao;

	/**
	 * @param register
	 *            This method receives user information to register.
	 */
	public void register(Registration register) {
		helpDeskDao.register(register);

	}

	/**
	 * @return String This method retrieves the Strings of states.
	 */
	public String getStates() {
		List<Map<String, String>> states = helpDeskDao.getStates();
		String statesDropDown = "";
		for (Map<String, String> state : states) {
			statesDropDown += "<option value='" + state.get("code") + "'>" + state.get("name") + "</option>";
		}
		return statesDropDown;

	}

	/**
	 * @return String This method retrieves the Strings of usertypes.
	 */
	public String getUserType() {
		List<Map<String, String>> type = helpDeskDao.getUsertype();
		String usertype = "";
		for (Map<String, String> user : type) {
			usertype += "<option value='" + user.get("value") + "'>" + user.get("type") + "</option>";
		}
		return usertype;
	}

}
