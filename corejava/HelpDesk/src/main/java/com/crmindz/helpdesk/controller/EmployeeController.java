package com.crmindz.helpdesk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crmindz.helpdesk.domain.TicketCreation;
import com.crmindz.helpdesk.service.EmployeeService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Puneeth The EmployeeController class implements methods with
 *         appropriate request mappings and returns the respective view to the
 *         employee after the login process
 */
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return String
	 * @throws IOException
	 *             The GridView Method returns the empform view for the
	 *             RequestMapping("/EmpControl").
	 */
	@RequestMapping("/empcontrol")
	@ResponseBody
	public String Gridview(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		
		List<TicketCreation> lc = employeeService.gridView();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonArray = gson.toJson(lc);
		return jsonArray;

	}

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return String
	 * @throws IOException
	 *             The ApprovalGridView Method returns the empApproveform view for
	 *             the RequestMapping("/EmpApprove").
	 */
	@RequestMapping("/empapprove")
	@ResponseBody
	public String approvalGridview(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		
		List<TicketCreation> lc = employeeService.ApprovalgridView();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonArray = gson.toJson(lc);
		return jsonArray;

	}

	/**
	 * @param request
	 * @param response
	 * @param session
	 * @return String
	 * @throws IOException
	 *             The RejectGridView Method returns the empRejectform view for the
	 *             RequestMapping("/EmpReject").
	 */
	@RequestMapping("/empreject")
	@ResponseBody
	public String rejectGridview(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		
		List<TicketCreation> lc = employeeService.RejectgridView();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonArray = gson.toJson(lc);
		return jsonArray;

	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException
	 *             The updateGridview passes the updated comments to the service
	 *             class when the employee approves the ticket.
	 */
	@RequestMapping("/empupdate")
	public void updateEmpGridview(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String ticketref = request.getParameter("val");
		String comments = request.getParameter("comments");
		employeeService.updateAcceptGrid(ticketref, comments);

	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException
	 *             The rejectGridview passes the updated comments to the service
	 *             class when the employee rejects the ticket.
	 */
	@RequestMapping("/empgridreject")
	public void rejectEmpGridview(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String ticketref = request.getParameter("val");
		String comments = request.getParameter("comments");
		employeeService.updateRejectGrid(ticketref, comments);

	}
}
