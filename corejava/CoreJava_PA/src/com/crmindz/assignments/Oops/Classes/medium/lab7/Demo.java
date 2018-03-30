package com.crmindz.assignments.Oops.Classes.medium.lab7;

/**
 * @author Puneeth
 *
 */
public class Demo {

	public static void main(String[] args) {
		Traveller t = new Traveller();
		Checks c = new Checks();
		t.setBaggageAmount(35);
		t.setTravellerId(1001);
		t.setExpiryYear(2019);
		t.setNocStatus(true);
		
		if((c.checkBaggage(t)==true)&&(c.checkImmigration(t)==true)&&(c.checkSecurity(t)==true)){
			System.out.println("Allow Traveller to fly!");
		}else{
			System.out.println("Detain Traveller for Re-checking!");
		}

	}

}
