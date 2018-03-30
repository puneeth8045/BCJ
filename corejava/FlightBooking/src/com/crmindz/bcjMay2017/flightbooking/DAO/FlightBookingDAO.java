package com.crmindz.bcjMay2017.flightbooking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.crmindz.bcjMay2017.flightbooking.jdbc.Util;
import com.crmindz.bcjMay2017.flightbooking.model.BookingDetails;
import com.crmindz.bcjMay2017.flightbooking.model.CardDetails;
import com.crmindz.bcjMay2017.flightbooking.model.Customer;
import com.crmindz.bcjMay2017.flightbooking.model.FlightDetails;

public class FlightBookingDAO {

	public static CardDetails getCardDetails(CardDetails cardd) {
		ResultSet result = null;
		CardDetails getCard = new CardDetails();
		try {
			Connection connect = Util.getConnection();
			PreparedStatement ps = connect.prepareStatement(
					"select cardNumber,cvv,availableBalance from thirdpartydetails where cardNumber=?");
			ps.setString(1, cardd.getCcNo());
			result = ps.executeQuery();
			while (result.next()) {
				getCard.setCcNo(result.getString("CardNumber"));
				getCard.setCvv(result.getString("cvv"));
				getCard.setAvailableBalance(result.getString("availableBalance"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return getCard;
	}

	public static Customer registerCustomerWithFlight(Customer cust) {
		Customer customer1 = new Customer();
		BookingDetails booking1 = new BookingDetails();
		FlightDetails flight1 = new FlightDetails();
		int id = 0, id1 = 0, id2 = 0;
		;
		try {
			Connection connect = Util.getConnection();
			String query1 = "insert into Customer (firstname,lastname,email,phone,accountno)" + " values (?,?,?,?,?)";
			PreparedStatement ps1 = connect.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
			ps1.setString(1, cust.getFirstName());
			ps1.setString(2, cust.getLastName());
			ps1.setString(3, cust.getEmail());
			ps1.setString(4, cust.getPhnNo());
			ps1.setString(5, cust.getAccountNo());
			ps1.executeUpdate();
			ResultSet rset = ps1.getGeneratedKeys();

			if (rset.next()) {
				id = rset.getInt(1);
			}
			PreparedStatement selectQuery2 = connect
					.prepareStatement("select firstname from Customer where customerid=? ");
			selectQuery2.setInt(1, id);
			ResultSet rsetQuery2 = selectQuery2.executeQuery();

			while (rsetQuery2.next()) {
				customer1.setFirstName(rsetQuery2.getString("firstname"));
			}
			String query2 = "insert into address( addressLine1, addressLine2, city, state, zip, Customer_customerid)"
					+ "values(?, ?, ?, ?,?,?)";
			PreparedStatement ps2 = connect.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);

			ps2.setString(1, cust.getAddress().getAddressLine1());
			ps2.setString(2, cust.getAddress().getAddressLine2());
			ps2.setString(3, cust.getAddress().getState());
			ps2.setString(4, cust.getAddress().getCity());
			ps2.setString(5, cust.getAddress().getZipCode());
			ps2.setInt(6, id);
			ps2.executeUpdate();

			String query3 = "insert into User(username,password,Customer_customerid)" + "values(?, ?, ?)";
			PreparedStatement ps3 = connect.prepareStatement(query3, Statement.RETURN_GENERATED_KEYS);
			ps3.setString(1, cust.getLogin().getUserid());
			ps3.setString(2, cust.getLogin().getPassword());
			ps3.setInt(3, id);
			ps3.executeUpdate();
			ResultSet rset1 = ps3.getGeneratedKeys();

			if (rset1.next()) {
				id1 = rset1.getInt(1);
			}
			String save = cust.getSave();
			if ("save".equals(save)) {
				String query4 = "insert into PaymentDetaiils(cardName,cardNumber,monthOfExpiry,yearOfExpiry,cvv,User_userid)"
						+ "values(?, ?, ?, ?, ?, ?)";
				PreparedStatement ps4 = connect.prepareStatement(query4, Statement.RETURN_GENERATED_KEYS);

				ps4.setString(1, cust.getSpd().getNameOnCard1());
				ps4.setString(2, cust.getSpd().getCcNo1());
				ps4.setString(3, cust.getSpd().getExpMonth1());
				ps4.setString(4, cust.getSpd().getExpYear1());
				ps4.setString(5, cust.getSpd().getCvv1());
				ps4.setInt(6, id1);
				ps4.executeUpdate();
			}
			String query5 = "insert into BookingDetails(ItenaryNumber,date,fare,Customer_customerid)"
					+ "values( ?, ?, ?, ?)";
			PreparedStatement ps5 = connect.prepareStatement(query5, Statement.RETURN_GENERATED_KEYS);

			
			ps5.setString(1, cust.getBd().getIteneryNo());
			ps5.setDate(2, cust.getBd().getBookingDate());
			ps5.setString(3, cust.getBd().getFare());
			ps5.setInt(4, id);
			ps5.executeUpdate();
			ResultSet rset2 = ps5.getGeneratedKeys();

			if (rset2.next()) {
				id2 = rset2.getInt(1);
			}
			PreparedStatement selectQuery = connect.prepareStatement(
					"select ItenaryNumber,Fare from BookingDetails where ItenaryNumber=? ");
			selectQuery.setString(1, cust.getBd().getIteneryNo());
			ResultSet rsetQuery = selectQuery.executeQuery();

			while (rsetQuery.next()) {
				booking1.setIteneryNo(rsetQuery.getString("ItenaryNumber"));
				booking1.setFare(rsetQuery.getString("Fare"));
			}
            if(cust.getFd().getTravelType().equals("oneway")){
            	String query6 = "insert into FlightDetails(source,destination,travelDate,BookingDetails_bd_id)" + "values(?, ?, ?,?)";
    			PreparedStatement ps6 = connect.prepareStatement(query6);

    			ps6.setString(1, cust.getFd().getSource());
    			ps6.setString(2, cust.getFd().getDestination());
    			ps6.setString(3, cust.getFd().getTravelDate());
    			ps6.setInt(4, id2);
    			ps6.executeUpdate();
    			ResultSet rsetTicket = ps6.getGeneratedKeys();

    			int ticketID = 0;
    			if (rsetTicket.next()) {
    				ticketID = rsetTicket.getInt(1);
    			}

    			PreparedStatement selectQuery1 = connect
    					.prepareStatement("select source,destination,travelDate from FlightDetails where fd_id=? ");
    			selectQuery1.setInt(1, ticketID);
    			ResultSet rsetQuery1 = selectQuery1.executeQuery();

    			while (rsetQuery1.next()) {
    				flight1.setSource(rsetQuery1.getString("source"));
    				flight1.setDestination(rsetQuery1.getString("destination"));
    				flight1.setTravelType(rsetQuery1.getString("travelDate"));
    			}	
            }else{
            	String query7 = "insert into FlightDetails(source,destination,travelDate,returnDate,BookingDetails_bd_id)"+"values(?,?,?,?,?)";
            	PreparedStatement ps7 = connect.prepareStatement(query7);
            	
            	ps7.setString(1, cust.getFd().getSource());
            	ps7.setString(2, cust.getFd().getDestination());
            	ps7.setString(3,cust.getFd().getTravelDate());
            	ps7.setString(4, cust.getFd().getReturnDate());
            	ps7.setInt(5, id2);
            	ps7.executeUpdate();
            	ResultSet rsetTicket = ps7.getGeneratedKeys();
            	
            	int ticketID=0;
            	if(rsetTicket.next()){
            		ticketID = rsetTicket.getInt(1);
            	}
            	PreparedStatement selectQuery1 = connect.prepareStatement("select source,destination,travelDate,returnDate from FlightDetails where fd_id=?");
            	selectQuery1.setInt(1, ticketID);
            	ResultSet rsetQuery1 = selectQuery1.executeQuery();
            	while(rsetQuery1.next()){
            		flight1.setSource(rsetQuery1.getString("source"));
            		flight1.setDestination(rsetQuery1.getString("destination"));
            		flight1.setTravelDate(rsetQuery1.getString("travelDate"));
            		flight1.setReturnDate(rsetQuery1.getString("returnDate"));
            	}
            }
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		customer1.setBd(booking1);
		customer1.setFd(flight1);
		return customer1;
	}

}
