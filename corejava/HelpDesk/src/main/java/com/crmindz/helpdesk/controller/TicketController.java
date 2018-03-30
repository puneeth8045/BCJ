package com.crmindz.helpdesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crmindz.helpdesk.dao.HelpDeskDao;
import com.crmindz.helpdesk.domain.TicketCreation;

@RestController
public class TicketController {

	@Autowired
	HelpDeskDao helpDeskDao;

	@RequestMapping(value = "/ticket/{username:.+}", method = RequestMethod.GET)
	public @ResponseBody TicketCreation getTicketByUsername(@PathVariable("username") String username) {

		List<TicketCreation> Ticket = helpDeskDao.getGrid(username);
		TicketCreation Ticket1 = Ticket.get(0);

		return Ticket1;

	}
}
