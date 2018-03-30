package com.crmindz.bcjMay2017.Controller.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjMay2017.Model.CustomerDetails;
import com.crmindz.bcjMay2017.Service.registration.RegistrationService;



/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDetails cd = new CustomerDetails();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phoneNo = request.getParameter("phonenumber");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		cd.setFirstName(firstname);
		cd.setLastName(lastname);
		cd.setEmail(email);
		cd.setPhoneNo(phoneNo);
		cd.setUsername(username);
		cd.setPassword(password);
		System.out.println(cd.toString());
		
		CustomerDetails cd1=RegistrationService.RegisterCustomerAcct(cd);
		if(cd1.getUsername()!= null){
			out.print("<html><body>");
			out.print("<h3>"+"Account successfully created"+"</h3>");
			out.print("<h3>"+"Please Login.Click the below link to login"+"</h3>");
			out.print("<a href=login.html>Login</a>");
		}else{
			out.print("<h3>"+"Please register"+"</h3>");
			out.print("<a href=registration.html>Register</a>");
		}out.print("</body></html>");
	
	
	}

}
