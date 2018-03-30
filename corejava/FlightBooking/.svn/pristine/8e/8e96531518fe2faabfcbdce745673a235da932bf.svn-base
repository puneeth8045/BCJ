package com.crmindz.bcjMay2017.flightbooking.service;

import java.sql.Date;

import com.crmindz.bcjMay2017.flightbooking.DAO.FlightBookingDAO;
import com.crmindz.bcjMay2017.flightbooking.model.BookingDetails;
import com.crmindz.bcjMay2017.flightbooking.model.CardDetails;
import com.crmindz.bcjMay2017.flightbooking.model.Customer;

public class FlightBookingService {
	private static String getRandomNumber(int n) {
		int m = (int) (Math.random() * n + 1);
		return Integer.toString(m);
	}

	public static boolean verifyCardDetails(CardDetails cardd, BookingDetails bookd) {
		CardDetails getDetails = FlightBookingDAO.getCardDetails(cardd);

		if (cardd.getCcNo().equals(getDetails.getCcNo()) && (cardd.getCvv().equals(getDetails.getCvv()))) {
			int available = Integer.parseInt(getDetails.getAvailableBalance());
			int fare = Integer.parseInt(bookd.getFare());
			available = available - fare;
			if (fare < available) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public static Customer registerCustomerBooking(Customer cust, BookingDetails bookd) {
		cust.setAccountNo(getRandomNumber(10000000));
		bookd.setIteneryNo(getRandomNumber(100000));
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		bookd.setBookingDate(date);
		cust.setBd(bookd);
		Customer customer1 = FlightBookingDAO.registerCustomerWithFlight(cust);

		return customer1;
	}

}
