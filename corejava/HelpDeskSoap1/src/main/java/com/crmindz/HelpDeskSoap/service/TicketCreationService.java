package com.crmindz.HelpDeskSoap.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.HelpDeskSoap.dao.HelpDeskDao;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;




/**
 * @author Puneeth
 *
 *         This Class implements methods to generate business logic wherever
 *         required.
 */
@Service
public class TicketCreationService {

	@Autowired
	HelpDeskDao helpDeskDao;

	/**
	 * @param Ticket
	 * @param username
	 *            This method generates ticket number and set's status of the ticket
	 *            as pending and comments as under review.
	 */
	public void createTicket(TicketCreation Ticket, String username) {
		
		Ticket.setStatus("Pending");
		int ticket = (int) (Math.random() * 10000);
		Ticket.setTicketreferenceno(ticket);
		Ticket.setComments("We are working on it!!");
		helpDeskDao.createTicket(Ticket, username);

	}

	/**
	 * @return String This method retrieves ticket category.
	 */
	public String getCategory() {
		
		List<Map<String, String>> list = helpDeskDao.getCategory();
		String category = "";
		for (Map<String, String> user : list) {
			category += "<option value='" + user.get("category") + "'>" + user.get("category") + "</option>";
		}
		return category;
	}

	/**
	 * @param subcategory
	 * @return List This method forwards sub category based on the category selected
	 *         by user.
	 */
	public List<Map<String, String>> getSubCategory(String subcategory) {
		List<Map<String, String>> list1 = helpDeskDao.getSubCategory(subcategory);
		return list1;
	}

}
