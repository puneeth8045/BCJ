package com.crmindz.assignments.Operators.lab5;

import java.util.Scanner;

/**
 * @author Puneeth This class performs various arithematic operations on given
 *         two numbers.
 */
public class ArithmeticOperation {
	/**
	 * This method takes two inputs from user and performs addition,
	 * subtraction, multiplication and division on given numbers.
	 */
	public void doOperations(int num1, int num2) {

		int addResult = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + addResult);

		int subResult = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + subResult);

		int mulResult = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mulResult);

		int divResult = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 + " is: " + divResult);

	}

	public static void main(String args[]) {

		ArithmeticOperation ao = new ArithmeticOperation();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two numbers:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		ao.doOperations(num1, num2);

		sc.close();
	}
}
