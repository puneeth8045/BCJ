package com.crmindz.helpdesk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crmindz.helpdesk.domain.LoginCredentails;
import com.crmindz.helpdesk.domain.Registration;
import com.crmindz.helpdesk.service.RegistrationService;;

/**
 * @author Puneeth
 * 
 *         This Class Implements methods to register users and confirm their
 *         registration.
 */
@RestController
public class RegistrationController {
	@Autowired
	public RegistrationService registrationService;

	/**
	 * @param request
	 * @param response
	 * @return A Message and view. This method renders the registration view.
	 */
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		String stateData = registrationService.getStates();
		String usertype = registrationService.getUserType();
		ModelAndView model = new ModelAndView("Registration");
		model.addObject("stateData", stateData);
		model.addObject("usertype", usertype);
		model.addObject("register", new Registration());
		return model;

	}

	/**
	 * @param request
	 * @param response
	 * @param register
	 * @return ModelAndView This method forward's user Types to populate while
	 *         registering.
	 */
	@RequestMapping("/registrationprocess")
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("register") Registration register) {
		System.out.println(register.getFirstName());
		System.out.println(registrationService);
		registrationService.register(register);
		return new ModelAndView("Login", "LoginCredentails", new LoginCredentails());

	}

}
