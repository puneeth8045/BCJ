package com.crmindz.assignments.FlowControl.lab2;

import java.util.Scanner;

/**
 * @author Puneeth.
 * This class will print the message based on the marks given as
 *         input.
 */
public class ExamQualification {
	/**
	 * @param marks
	 * @return true or false.
	 * This method will take the marks as input and
	 *         returns true if marks are >=65 and <= 100 else returns false.
	 */
	public boolean hasPassed(int marks) {
		if (marks > 65 && marks <= 100) {
			System.out.println("Passed Successfully!");
			return true;
		} else {
			System.out.println("Failed! The range of qualifying the exam is between 65 to 100 ");
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int m = sc.nextInt();
		ExamQualification e = new ExamQualification();
		e.hasPassed(m);
		sc.close();
		// TODO Auto-generated method stub

	}

}
