package com.crmindz.assignments.FlowControl.lab11;

/**
 * @author Puneeth This class will print the asterix using repetition
 *         statements.
 */
public class Asterix {

	public static void main(String[] args) {
		for (int j = 0; j <= 8; j++) {
			System.out.println();
			if (j % 2 == 0) {
				System.out.print(" ");
			}
			for (int i = 0; i <= 8; i++) {
				System.out.print("* ");

			}

		}
	}
}
