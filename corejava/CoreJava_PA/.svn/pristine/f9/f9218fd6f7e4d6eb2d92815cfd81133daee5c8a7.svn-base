package com.crmindz.assignments.DataTypes.Strings.lab3;

import java.util.Scanner;

/**
 * @author Puneeth This class will check for various validation rules in the
 *         given email id and determines whether the email id is valid or not.
 */
public class EmailValidation {
	private String emailId = "";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any email Id:");

		EmailValidation ev = new EmailValidation();
		ev.setEmailId(scanner.next());

		String validation = ev.validateEmail(ev.getEmailId());
		System.out.println(validation);

		scanner.close();
	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;
	}

	public String getEmailId() {

		String mailId = emailId;

		return mailId;
	}

	/**
	 * @param emailId
	 * @return result This method will take the email id as input and and check
	 *         for validation rules and returns the result after validation
	 *         stating the email id is valid or not.
	 */
	public String validateEmail(String emailId) {

		String result = "";
		String lengthCheckResult = checkLength(emailId);
		String positionCheckResult = "";
		String combinationCheckResult = "";
		String firstCharCheckResult = "";

		if ("Not Valid".equals(lengthCheckResult)) {
			result = "Invalid Length of email Id";
		} else {
			positionCheckResult = checkPosition(emailId);

			if ("Not Valid".equals(positionCheckResult)) {
				result = "Invalid Position of Special Characters";
			} else {
				combinationCheckResult = checkCombination(emailId);

				if ("Not Valid".equals(combinationCheckResult)) {
					result = "Invalid Combination for username";
				} else {
					firstCharCheckResult = checkFirstChar(emailId);

					if ("Not Valid".equals(firstCharCheckResult)) {
						result = "Invalid Case of First Letter";
					}
				}
			}
		}

		if (("Valid".equals(lengthCheckResult)) && ("Valid".equals(positionCheckResult))
				&& ("Valid".equals(combinationCheckResult)) && ("Valid".equals(firstCharCheckResult))) {
			result = "Email Id is VALID!";
		}
		return result;
	}

	/**
	 * @param emailId
	 * @return message This method will take the email id as input and checks
	 *         the length of the mail id and returns a message stating it is
	 *         valid or not.
	 */
	public String checkLength(String emailId) {

		String message = "";

		if ((emailId.length() > 3) && (emailId.length() < 20)) {
			message = "Valid";
		} else {
			message = "Not Valid";
		}

		return message;
	}

	/**
	 * @param emailId
	 * @return message This method will take the email id as input and checks
	 *         for the number of dots after @ symbol and returns a message
	 *         stating it is valid or not.
	 */
	public String checkPosition(String emailId) {

		String message = "";
		int index = emailId.indexOf('@');
		String sub = emailId.substring(index);
		int count = 0;
		char matcher = '.';

		for (int i = 0; i < sub.length(); i++) {
			if (sub.charAt(i) == matcher) {
				count++;
			}
		}

		if ((count > 0) && (count <= 2)) {
			message = "Valid";
		} else {
			message = "Not Valid";
		}

		return message;
	}

	/**
	 * @param emailId
	 * @return message This method will take the email id as input and checks
	 *         for the upper case, lower case and underscore and returns a
	 *         message stating it is valid or not.
	 */
	public String checkCombination(String emailId) {

		int index = emailId.indexOf('@');
		String sub = emailId.substring(0, index);
		int countUpper = 0;
		int countLower = 0;
		int countUnderscore = 0;
		char matcher = '_';
		String message = "";

		for (int i = 0; i < sub.length(); i++) {

			if (Character.isUpperCase(sub.charAt(i))) {
				countUpper = 1;
			}
			if (Character.isLowerCase(sub.charAt(i))) {
				countLower = 1;
			}
			if (matcher == sub.charAt(i)) {
				countUnderscore = 1;
			}
		}

		if ((countUpper == 1) && (countLower == 1) && (countUnderscore == 1)) {
			message = "Valid";
		} else {
			message = "Not Valid";
		}

		return message;
	}

	/**
	 * @param emailId
	 * @return message This method will take the email id as input and checks
	 *         whether the first character is in upper case or not and returns a
	 *         message stating it is valid or not.
	 */
	public String checkFirstChar(String emailID) {

		String message = "";

		if (Character.isUpperCase(emailID.charAt(0))) {
			message = "Valid";
		} else {
			message = "Not Valid";
		}

		return message;
	}
}
