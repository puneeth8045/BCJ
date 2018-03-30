package com.crmindz.HelpDesk;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.crmindz.helpdesk.dao.HelpDeskDao;
import com.crmindz.helpdesk.domain.Registration;
import com.crmindz.helpdesk.service.RegistrationService;

/**
 * @author Puneeth This class tests the methods in the RegistrationService
 *         class.
 */
@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceTest {
	@Mock
	private HelpDeskDao registerDao;

	@InjectMocks
	private RegistrationService Service;

	/**
	 * This method tests the register method in the RegistrationService Class.
	 */
	@Test
	public void testregister() {
		Mockito.doNothing().when(registerDao).register(Mockito.any(Registration.class));
		Service.register(new Registration());
		Mockito.verify(registerDao, times(1)).register(Mockito.any(Registration.class));
	}

	/**
	 * This method tests the getStates method in the RegistrationService Class.
	 */
	@Test
	public void testgetStates() {
		List<Map<String, String>> states = new ArrayList<Map<String, String>>();
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("code", "FL");
		map1.put("name", "Florida");
		states.add(map1);
		when(registerDao.getStates()).thenReturn(states);
		String statesDropDown = "<option value='" + "FL" + "'>" + "Florida" + "</option>";
		assertEquals(statesDropDown, Service.getStates());
	}

	/**
	 * This method tests the getUserType method in the RegistrationService Class.
	 */
	@Test
	public void getUserTypetest() {
		List<Map<String, String>> type = new ArrayList<Map<String, String>>();
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("type", "Student");
		map1.put("value", "S");
		type.add(map1);
		when(registerDao.getUsertype()).thenReturn(type);
		String usertype = "<option value='" + "S" + "'>" + "Student" + "</option>";
		assertEquals(usertype, Service.getUserType());
	}
}
