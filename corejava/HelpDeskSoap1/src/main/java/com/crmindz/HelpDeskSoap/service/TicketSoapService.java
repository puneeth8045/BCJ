package com.crmindz.HelpDeskSoap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.crmindz.HelpDeskSoap.domain.TicketCreation;


@WebService
public interface TicketSoapService {
	
	@WebMethod
	public TicketCreation gridView(String username);

}
