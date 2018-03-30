package com.crmindz.assignments.FlowControl.lab7;

import java.util.Scanner;

/**
 * @author Puneeth This class will compare all the inputs given and prints the
 *         largest number among the given integers.
 */
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1, number, largest = 0;

		while (counter <= 10) {
			System.out.printf("Insert number %d: ", counter);
			number = sc.nextInt();
			if (number > largest) {
				largest = number;
			}
			counter++;
		}
		sc.close();

		System.out.printf("The largest number is: %d\n", largest);
	}
}
