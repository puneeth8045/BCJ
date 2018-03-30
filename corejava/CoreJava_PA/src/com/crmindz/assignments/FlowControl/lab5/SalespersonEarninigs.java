package com.crmindz.assignments.FlowControl.lab5;

import java.util.Scanner;

/**
 * @author Puneeth This class will calculate the weekly earnings of salesperson
 *         based on the items and number of items sold.
 */
public class SalespersonEarninigs {
	/**
	 * This method will take the type of item and number of items sold and
	 * calculates the earnings for the week.
	 */
	public void earningCalculation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Item1 sold: ");
		double item1 = sc.nextDouble() * 239.99;
		System.out.print("Enter the number of Item2 sold: ");
		double item2 = sc.nextDouble() * 129.75;
		System.out.print("Enter the number of Item3 sold: ");
		double item3 = sc.nextDouble() * 99.95;
		System.out.print("Enter the number of Item4 sold: ");
		double item4 = sc.nextDouble() * 350.89;

		double total = item1 + item2 + item3 + item4;
		double earning = 200 + total * 0.09;
		System.out.println("The earning for this week is :" + earning);
		sc.close();

	}

	public static void main(String[] args) {
		SalespersonEarninigs spe = new SalespersonEarninigs();
		spe.earningCalculation();

	}
}
