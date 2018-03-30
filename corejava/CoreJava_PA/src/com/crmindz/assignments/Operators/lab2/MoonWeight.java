package com.crmindz.assignments.Operators.lab2;

import java.util.Scanner;

/**
 * @author Puneeth This class will convert the weight on earth to weight on
 *         moon.
 */
public class MoonWeight {
	/**
	 * @param weight
	 *            This method will take the earth weight and convert it into
	 *            moon weight and displays it.
	 */
	public void weightCalculation(double weight) {
		double mweight = weight * .17;
		System.out.println("Weight on the moon: " + mweight);

	}

	public static void main(String[] args) {
		double weight;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight on earth : ");
		weight = sc.nextDouble();
		MoonWeight mw = new MoonWeight();
		mw.weightCalculation(weight);
		sc.close();

	}

}
