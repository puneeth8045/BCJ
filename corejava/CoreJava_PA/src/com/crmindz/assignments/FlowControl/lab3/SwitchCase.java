package com.crmindz.assignments.FlowControl.lab3;

/**
 * @author Puneeth. This class will print the range of marks based on the grade
 *         determined.
 */
public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Your Marks are in the range of: 80-100");
			break;
		case 'B':
			System.out.println("Your Marks are in the range of: 73-79");
			break;
		case 'C':
			System.out.println("Your Marks are in the range of: 65-72");
			break;
		case 'D':
			System.out.println("Your Marks are in the range of: 55-64");
			break;
		case 'E':
			System.out.println("Your Marks are in the range of: <55");
			break;
		default:
			System.out.println("Grade does not exist");

		}

	}
}
