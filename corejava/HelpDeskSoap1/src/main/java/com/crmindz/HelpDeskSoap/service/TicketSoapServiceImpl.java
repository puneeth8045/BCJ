package com.crmindz.HelpDeskSoap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.crmindz.HelpDeskSoap.dao.HelpDeskDao;
import com.crmindz.HelpDeskSoap.dao.HelpDeskDaoImpl;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;

@WebService(endpointInterface = "com.crmindz.HelpDeskSoap.service.TicketSoapService",serviceName ="ticketsoapservice")
public class TicketSoapServiceImpl implements TicketSoapService {

	@Autowired
	HelpDeskDao helpdeskdao;
	
	public TicketCreation gridView(String username) {
		List<TicketCreation> ticket = helpdeskdao.getGrid(username);
		TicketCreation ticket1 = ticket.get(0);
		
		return ticket1;
	}

}
