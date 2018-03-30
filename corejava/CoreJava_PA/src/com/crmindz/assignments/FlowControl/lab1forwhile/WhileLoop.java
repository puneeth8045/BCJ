package com.crmindz.assignments.FlowControl.lab1forwhile;

/**
 * @author Puneeth This class will print even numbers between 50 and 80 using
 *         while loop.
 */
public class WhileLoop {

	public static void main(String[] args) {
		int i = 50;
		while (i < 80) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		// TODO Auto-generated method stub

	}

}
