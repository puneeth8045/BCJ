package com.crmindz.assignments.Oops.Classes.medium.lab7;

/**
 * @author Puneeth This class checks baggage,security and checks immigration.
 */
public class Checks {
	/**
	 * @param t
	 * @return Check baggageamount
	 */
	public boolean checkBaggage(Traveller t) {
		if (t.getBaggageAmount() > 0 && t.getBaggageAmount() <= 40) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param t
	 * @return Check immigration
	 */
	public boolean checkImmigration(Traveller t) {
		if (t.getExpiryYear() >= 2001 && t.getExpiryYear() <= 2025) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param t
	 * @return Check Security status
	 */
	public boolean checkSecurity(Traveller t) {
		if (t.nocStatus = true) {
			return true;
		} else {
			return false;
		}
	}
}
