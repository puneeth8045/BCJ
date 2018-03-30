package com.crmindz.bcjMay2017.flightbooking.model;

import java.sql.Date;

public class BookingDetails {
	
	private String iteneryNo;

	private Date bookingDate;
	private String fare;


	public String getIteneryNo() {
		return iteneryNo;
	}

	public void setIteneryNo(String iteneryNo) {
		this.iteneryNo = iteneryNo;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

}
