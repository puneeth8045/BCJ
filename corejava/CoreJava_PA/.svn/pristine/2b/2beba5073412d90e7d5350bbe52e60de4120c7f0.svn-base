package com.crmindz.assignments.Oops.Classes.simple.lab6;

/**
 * @author Puneeth In this class Ticket implementing getters and setters to get
 *         the data and to set the data.
 */
public class Ticket {
	int startPoint = 2;
	int endPoint = 18;
	int ticketAmount;

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	public Ticket() {
		super();
	}

	public Ticket(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	/**
	 * @return checks whether endPoint and startPoint valid or not
	 */
	public boolean validateTravelPoints() {
		if ((endPoint > 0) && (startPoint > 0) && (endPoint > startPoint)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Caluculating amountOfTicket by using endPoint and startPoint
	 */
	public void calculateTicketAmt() {
		ticketAmount = (endPoint - startPoint) * 20;
		System.out.println("The ticket price is : " + ticketAmount);
	}
}
