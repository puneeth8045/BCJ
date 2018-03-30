package com.crmindz.helpdesk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.helpdesk.dao.HelpDeskDao;
import com.crmindz.helpdesk.domain.TicketCreation;

/**
 * @author Puneeth
 * 
 *         This class gives the employee view when the employee logins.
 */
@Service
public class EmployeeService {

	@Autowired
	HelpDeskDao helpDeskDao;

	/**
	 * @return List This method forwards list of tickets which are new from
	 *         student/consultant.
	 */
	public List<TicketCreation> gridView() {
		List<TicketCreation> lc = helpDeskDao.getEmpGrid();
		return lc;
	}

	/**
	 * @return List This method forwards list of tickets which are approved.
	 */
	public List<TicketCreation> ApprovalgridView() {
		List<TicketCreation> lc = helpDeskDao.getApprovalEmpGrid();
		return lc;
	}

	/**
	 * @return List This method forwards list of tickets which are denied.
	 */
	public List<TicketCreation> RejectgridView() {
		List<TicketCreation> lc = helpDeskDao.getRejectEmpGrid();
		return lc;
	}

	/**
	 * @param ticketref
	 * @param comments
	 *            This method forward's ticket to DAO to update/approve ticket.
	 */
	public void updateAcceptGrid(String ticketref, String comments) {
		helpDeskDao.updateGrid(ticketref, comments);
	}

	/**
	 * @param ticketref
	 * @param comments
	 *            This method forward's ticket to DAO to update/deny ticket.
	 */
	public void updateRejectGrid(String ticketref, String comments) {
		helpDeskDao.updateRejectGrid(ticketref, comments);
	}
}
