package com.crmindz.assignments.FlowControl.lab6;

import java.util.Scanner;

/**
 * @author Puneeth This class will calculate the credit limit of the customer
 *         based on the purchases made by the customer.
 */
public class CreditLimit {
	/**
	 * This method will take all the inputs from the user and calculates the
	 * credit limit of the customer and prints a message if the credit limit is
	 * exceeded.
	 */
	public void limitCalculation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter the balance at the beginning of the month: ");
		int balance = sc.nextInt();
		System.out.print("Enter the total of all items charged by the customer this month: ");
		int chargedAmount = sc.nextInt();
		System.out.print("Enter the total of all credits applied to the customer’s account this month: ");
		int creditAmount = sc.nextInt();
		System.out.print("Enter the allowed credit limit: ");
		int creditLimit = sc.nextInt();

		int newBalance = (balance + chargedAmount - creditAmount);
		System.out.println("The new balance is " + newBalance);
		if (creditLimit < newBalance) {
			System.out.println("Credit limit exceeded");
			sc.close();
		}

	}

	public static void main(String[] args) {
		CreditLimit cl = new CreditLimit();
		cl.limitCalculation();

	}

}
