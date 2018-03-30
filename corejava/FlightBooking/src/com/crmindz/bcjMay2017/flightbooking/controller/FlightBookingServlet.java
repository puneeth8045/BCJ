package com.crmindz.bcjMay2017.flightbooking.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjMay2017.flightbooking.model.*;
import com.crmindz.bcjMay2017.flightbooking.service.FlightBookingService;

/**
 * Servlet implementation class FlightBookingServlet
 */
@WebServlet("/FlightBookingServlet")
public class FlightBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Customer cust = new Customer();
	Address add = new Address();
	LoginCredentails loginc = new LoginCredentails();
	FuturePaymentDetails savepayd = new FuturePaymentDetails();
	FlightDetails flightd = new FlightDetails();
	BookingDetails bookd = new BookingDetails();
	CardDetails cardd = new CardDetails();

	/**
	 * @return
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InputStream requestBodyInput = request.getInputStream();  
		System.out.println(requestBodyInput);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String addressLine1 = request.getParameter("address1");
		String addressLine2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipCode = request.getParameter("zipcode");

		String userid = request.getParameter("user id");
		String password = request.getParameter("password");

		String nameOnCard = request.getParameter("nameoncard");
		String ccNo = request.getParameter("card number");
		String expMonth = request.getParameter("month");
		String expYear = request.getParameter("year");
		String cvv = request.getParameter("CVV");

		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String travelDate = request.getParameter("fromdate");
		String returnDate = request.getParameter("todate");
		String travelType= request.getParameter("trip");
		flightd.setTravelType(travelType);
		

		String fare = request.getParameter("fare");

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phnNo = request.getParameter("phone number");
		String savepd = request.getParameter("save");

		add.setAddressLine1(addressLine1);
		add.setAdressLine2(addressLine2);
		add.setCity(city);
		add.setState(state);
		add.setZipCode(zipCode);

		loginc.setUserid(userid);
		loginc.setPassword(password);

		cardd.setNameOncard(nameOnCard);
		cardd.setCcNo(ccNo);
		cardd.setExpMonth(expMonth);
		cardd.setExpYear(expYear);
		cardd.setCvv(cvv);

		if ("save".equals(savepd)) {
			savepayd.setNameOnCard1(nameOnCard);
			savepayd.setCcNo1(ccNo);
			savepayd.setExpMonth1(expMonth);
			savepayd.setExpYear1(expYear);
			savepayd.setCvv1(cvv);

		}
        if("oneway".equals(travelType)){
        	flightd.setSource(source);
    		flightd.setDestination(destination);
    		flightd.setTravelDate(travelDate);	
        }else{
        	flightd.setSource(source);
        	flightd.setDestination(destination);
        	flightd.setTravelDate(travelDate);
        	flightd.setReturnDate(returnDate);
        	
        }
		

		bookd.setFare(fare);

		cust.setFirstName(firstname);
		cust.setLastName(lastname);
		cust.setEmail(email);
		cust.setPhnNo(phnNo);
		cust.setAddress(add);
		cust.setBd(bookd);
		cust.setCd(cardd);
		cust.setFd(flightd);
		cust.setSpd(savepayd);
		cust.setLogin(loginc);
		cust.setSave(savepd);
		boolean result = FlightBookingService.verifyCardDetails(cardd, bookd);
		if (result) {
			Customer customer = FlightBookingService.registerCustomerBooking(cust, bookd);
			if(travelType.equals("oneway")){
			out.println("Thanks " + customer.getFirstName() + " for booking flight with blueairlines");
			out.println("from:  " + customer.getFd().getSource() + "\t\t\tto:  " + customer.getFd().getDestination()+" on "+customer.getFd().getTravelDate());
			out.println("Your Account Number is:"+"ACC" + cust.getAccountNo());
			out.println("Your Itenary Number:" + "ITN" + customer.getBd().getIteneryNo());
			out.println("Enjoy your journey!!!!.");
			}
			else{
				out.println("Thanks " + customer.getFirstName() + " for booking flight with blueairlines");	
				out.println("from:  " + customer.getFd().getSource() + "\t\t\tto:  " + customer.getFd().getDestination()+" on "+customer.getFd().getTravelDate());
				out.println("and from: "+customer.getFd().getDestination()+"\t\t\tto:  "+ customer.getFd().getSource()+ " on "+customer.getFd().getReturnDate());
				out.println("Your Account Number is:"+"ACC" + cust.getAccountNo());
				out.println("Your Itenary Number:" + "ITN" + customer.getBd().getIteneryNo());
				out.println("Enjoy your journey!!!!.");
			}
		} else
			out.println("Invalid Card Details");
	}
}
