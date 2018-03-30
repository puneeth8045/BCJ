package com.crmindz.HelpDeskSoap.dao;

import java.util.List;
import java.util.Map;

import com.crmindz.HelpDeskSoap.domain.LoginCredentails;
import com.crmindz.HelpDeskSoap.domain.Registration;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;



public interface HelpDeskDao {

	void register(Registration register);

	List<LoginCredentails> getLoginDetails(LoginCredentails login);

	public List<TicketCreation> getGrid(String username);

	List<Map<String, String>> getStates();

	public List<Map<String, String>> getUsertype();

	public void createTicket(TicketCreation Ticket, String username);

	public List<Map<String, String>> getCategory();

	public List<Map<String, String>> getSubCategory(String subcategory);

	public List<TicketCreation> getEmpGrid();

	public List<TicketCreation> getApprovalEmpGrid();

	public void updateGrid(String ticketref, String comments);

	public List<TicketCreation> getRejectEmpGrid();

	public void updateRejectGrid(String ticketref, String comments);
}
