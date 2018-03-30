package com.crmindz.assignments.JavaLang.lab20;

/**
 * @author Puneeth This class contains two arrays of usernames and passwords.
 *         Username and Password of the user. It validates the username and
 *         password from the arrays.
 */
public class Login {
	static String[] usernames = new String[4];
	static String[] passwords = new String[4];
	String username;
	String password;

	static {
		usernames[0] = "admin";
		usernames[1] = "finance";
		usernames[2] = "student";
		passwords[1] = "Admin";
		passwords[2] = "Finance";
		passwords[3] = "Student";
	}

	public Login() {
		super();
		username = "student";
		password = "Student";
	}

	/**
	 * @return This method compares the username and password with the arrays of
	 *         usernames and passwords.
	 */
	public boolean validateLogin() {
		for (int i = 0; i < 4; i++) {
			if (username.equalsIgnoreCase(usernames[i])) {
				password.equals(passwords[i]);
				return true;
			}
		}
		return false;
	}

}
