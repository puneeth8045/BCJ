package com.crmindz.HelpDeskSoap.controller;

import java.util.List;
import java.util.Map;

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

import com.crmindz.HelpDeskSoap.domain.TicketCreation;
import com.crmindz.HelpDeskSoap.service.TicketCreationService;



/**
 * @author Puneeth
 *
 *         This class implements methods and maps the requests related to
 *         student/consultant tickets like creating, displaying. It also has
 *         some data populating methods.
 */
@RestController
public class TicketCreationController {

	@Autowired
	public TicketCreationService ticketCreationService;

	/**
	 * @param request
	 * @param response
	 * @return ModelAndView This method map's request to create new ticket and
	 *         forwards category for populating data in the view.
	 */
	@RequestMapping(value = "/createticket", method = RequestMethod.GET)
	public ModelAndView getCreateTicket(HttpServletRequest request, HttpServletResponse response) {
		String category = ticketCreationService.getCategory();
		ModelAndView mav = new ModelAndView("CreateTicket");
		mav.addObject("category", category);
		mav.addObject("TicketCreation", new TicketCreation());
		return mav;

	}

	/**
	 * @param request
	 * @param response
	 * @param Ticket
	 * @param session
	 * @return ModelAndView This method creates the ticket and returns the Student
	 *         view.
	 */
	@RequestMapping(value = "/createticketprocess", method = RequestMethod.POST)
	public ModelAndView createTicket(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("Ticket") TicketCreation Ticket, HttpSession session) {
		String username = (String) session.getAttribute("username");
		ticketCreationService.createTicket(Ticket, username);
		ModelAndView model = new ModelAndView("StudentView");
		return model;

	}

	/**
	 * @param request
	 * @param response
	 * @return String This method forwards sub category based on the category
	 *         selected by user.
	 */
	@RequestMapping(value = "/subcategory", method = RequestMethod.POST)
	@ResponseBody
	public String getSubCategory(HttpServletRequest request, HttpServletResponse response) {
		String subcategory = request.getParameter("valajax");
		System.out.println(subcategory);
		List<Map<String, String>> list = ticketCreationService.getSubCategory(subcategory);
		String ticketSubCategory = " ";
		for (Map<String, String> tSubCategory : list) {
			ticketSubCategory += "<option value='" + tSubCategory.get("query7") + "'>" + tSubCategory.get("query7")
					+ "</option>";
			System.out.println(ticketSubCategory);
		}
		return ticketSubCategory;

	}

}
