package com.crmindz.assignments.JavaLang.lab21;

/**
 * @author Puneeth This class is used to check the format of the email.
 *
 */
public class EmailCheck {
	String emailid;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	/**
	 * @return This method is used to validate the email.
	 */
	public boolean validateEmail() {
		if (emailid.length() > 3 && emailid.length() < 20) {
			if (emailid.contains("@") || (emailid.contains("@.."))) {
				String[] username = emailid.split("@");
				if (username[0].contains("_")) {
					System.out.println("Email id is Valid");
					return true;
				} else {
					System.out.println("Invalid Combination for username");
				}

			} else {
				System.out.println("Invalid Position of Special Characters");
			}
		} else {
			System.out.println("Invalid Length of email Id");
		}
		return false;
	}

	public static void main(String[] args) {
		EmailCheck email = new EmailCheck();
		email.setEmailid("Puneeth_a@gmail.com");
		email.validateEmail();

	}

}
