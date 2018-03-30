package com.crmindz.bcjMay2017.tsunamialerts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjMay2017.tsunamialerts.service.TsunamiAlertService;

/**
 * Servlet implementation class TsunamiAlertServlet
 */
@WebServlet("/TsunamiAlertServlet")
public class TsunamiAlertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TsunamiAlertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String country = request.getParameter("countryname");
		TsunamiAlertService t = new TsunamiAlertService();
		Map<String,String> map=t.processTsunamiData(country);
		
		Set<Entry<String,String>> entrySet=map.entrySet();
		for(Entry<String,String> entry: entrySet)
		{
			out.println("<html><body>");
			out.println("<div align=" + "center" + ">");
			out.println("<h1>");
			out.println("Alert Messages");
			out.println(entry.getKey());
			out.println(" ->");
			out.println(entry.getValue());
			out.println("<br>");
			out.println("</h1>");
			out.println("</div>");
			out.println("</body></html>");
		}
	}

}
