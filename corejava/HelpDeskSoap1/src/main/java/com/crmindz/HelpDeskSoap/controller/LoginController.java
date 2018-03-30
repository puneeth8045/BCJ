package com.crmindz.HelpDeskSoap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crmindz.HelpDeskSoap.domain.LoginCredentails;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;
import com.crmindz.HelpDeskSoap.service.LoginService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Puneeth The LoginController class implements methods with appropriate
 *         request mappings and returns the respective views to the user during
 *         the login process
 */
@RestController
public class LoginController {
	String S = "S";
	String C = "C";
	String E = "E";
	@Autowired
	public LoginService loginService;

	/**
	 * @param request
	 * @param response
	 * @return ModelAndView The showLogin Method returns the corresponding
	 *         ModelAndView with the Login view for the RequestMapping("/Login").
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginView(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView("Login", "LoginCredentails", new LoginCredentails());
		return model;

	}

	/**
	 * @param request
	 * @param response
	 * @param login
	 * @param session
	 * @return ModelAndView The loginProcess Method returns the respective view for
	 *         the corresponding usertype after the login verification is done.
	 */
	@RequestMapping("/loginprocess")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("Login") LoginCredentails login, HttpSession session) {
		
		ModelAndView mav = null;
		String usertype = loginService.validateUser(login);
		System.out.println(usertype);
		session.setAttribute("username", login.getUsername());
		session.setAttribute("usertype", usertype);
		if (usertype.equals(S)) {
			mav = new ModelAndView("StudentView");
			System.out.println("abc");
			return mav;
		}

		else if (usertype.equals(C)) {
			mav = new ModelAndView("StudentView");
			return mav;
		}

		else if (usertype.equals(E)) {
			mav = new ModelAndView("EmployeeView");
			return mav;
		}

		else if ("Username is incorrect!!!!".equals(usertype)) {
			mav = new ModelAndView("Login", "error", "Username is incorrect!!!!");
			return mav;
		}

		else {
			mav = new ModelAndView("Login", "error", "Password is incorrect!!!!");
			return mav;
		}

	}

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return String
	 * @throws IOException
	 *             This method Forwards list of tickets for a requested user.
	 */
	@RequestMapping("/ticketgrid")
	@ResponseBody
	public String Gridview(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		
		String username = (String) session.getAttribute("username");
		System.out.println(username);
		List<TicketCreation> lc = loginService.gridView(username);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonArray = gson.toJson(lc);
		System.out.println(jsonArray);
		return jsonArray;

	}

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return String This method redirects the request to the ticketManagement.
	 */
	@RequestMapping("/ticketmanagement")
	public String ticketManagement(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		if (session.getAttribute("username") != null) {
			if (session.getAttribute("usertype").equals(S) || session.getAttribute("usertype").equals(C)) {
				return "StudentView";
			} else {
				return "EmployeeView";
			}
		}
		return "TicketManagement";
	}

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return ModelAndView This method Render's the view after invalidating the
	 *         session.
	 */
	@RequestMapping("/logout")
	public ModelAndView logoutProcess(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		session.invalidate();
		ModelAndView mav = new ModelAndView("Login");
		return mav;
	}
}
