package com.crmindz.bcjMay2017.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjMay2017.Model.AWSLoginCredentials;
import com.crmindz.bcjMay2017.Service.LoginService;







/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AWSServlet")
public class AWSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AWSLoginCredentials awss = new AWSLoginCredentials();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AWSServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		awss.setUserName(userName);
		awss.setPassword(password);
		
		
		System.out.println(userName);
		
		boolean  b = LoginService.authenticateLogin(awss);
		
response.setContentType("text/html");
PrintWriter out = response.getWriter();
		if(b){
			out.print("login successful!!!");
			out.print("<a href=ProductCatalog.html>Product</a>");
			
			
		}else{
			out.print("<html><body>");
			out.print("<h4>"+"Please register"+"</h4>");
			out.print("<a href=registration.html>Registration</a>");
			out.print("</body></html>");
		}
		
	}}

	
	