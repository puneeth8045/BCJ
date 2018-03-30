package com.crmindz.assignments.Oops.Classes.simple.lab6;

/**
 * @author Puneeth create object for Ticket class and call the methods
 */
public class Demo {

	public static void main(String[] args) {
		Ticket newTicket = new Ticket();
		Ticket newTicket1 = new Ticket(18, 1);
		Ticket newTicket2 = new Ticket(2, 18);

		newTicket1.validateTravelPoints();
		newTicket2.calculateTicketAmt();

	}

}
