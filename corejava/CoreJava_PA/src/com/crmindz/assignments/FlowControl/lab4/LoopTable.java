package com.crmindz.assignments.FlowControl.lab4;

/**
 * @author Puneeth This class will print a table which shows multiples of 1 to 5
 *         for 10, 100, and 1000.
 */
public class LoopTable {
	public static void main(String[] args) {
		System.out.println("N" + "\t10*N" + "\t100*N" + "\t1000*N");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\t" + 10 * i + "\t" + 100 * i + "\t" + 1000 * i);
		}
	}

}
