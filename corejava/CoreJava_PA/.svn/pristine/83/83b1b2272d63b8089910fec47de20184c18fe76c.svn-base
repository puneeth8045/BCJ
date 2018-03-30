package com.crmindz.assignments.Operators.lab4;

import java.util.Scanner;

/**
 * @author Puneeth This class will convert the temperature in celsius to
 *         farenheit and temparature in farenheit to celsius.
 */
public class TemperatureConversion {
	/**
	 * @param F
	 *            This method will take temperature in farenheit and convert to
	 *            celsius.
	 */
	public static void conversionFtoC(int F) {
		int c;
		c = (F - 32) * 5 / 9;
		System.out.println("Given temperature in Celsius: " + c);
	}

	/**
	 * @param C
	 *            This method will take temperature in celcius and convert to
	 *            farenheit.
	 */
	public static void conversionCtoF(int C) {
		int f;
		f = (C * 9 / 5) + 32;
		System.out.println("Given temperature in Fahrenheit: " + f);
	}

	public static void main(String[] args) {
		System.out.print("Give a temperature: ");
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		conversionFtoC(X);
		conversionCtoF(X);
		sc.close();
	}

}
