package com.crmindz.assignments.Oops.Classes.simple.lab1;

/**
 * @author Puneeth In this Class we are generating the password as per the
 *         requirement.
 */
public class PasswordGenerator {

	public static void main(String[] args) {
		String result = "";

		for (int i = 0; i <= 3; i++) {
			result += (char) (Math.random() * 26 + 'a');
			result += (int) (Math.random() * 10);
		}

		System.out.println("The password is: " + result);
	}

}
