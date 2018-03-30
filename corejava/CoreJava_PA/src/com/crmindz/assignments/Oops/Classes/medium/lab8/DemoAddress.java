package com.crmindz.assignments.Oops.Classes.medium.lab8;

/**
 * @author Puneeth Class to demonstrate the working of address entity class
 */
public class DemoAddress {

	public static void main(String[] args) {
		Address a = new Address();
		a.setAddressLine("8231 Ranchview Dr");
		a.setCity("Irving");
		a.setZip("75063");
		a.setState("Texas");

		System.out.println("Address line: " + a.getAddressLine());
		System.out.println("City: " + a.getCity());
		System.out.println("ZipCode: " + a.getZip());
		System.out.println("State: " + a.getState());

	}

}
