package com.crmindz.assignments.Collections.Comparator.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Puneeth In this class Sorting printing the sorting numbers as per the
 *         requirement.
 */
public class Sorting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int listSize = 30;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);

		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers, new AlternateOrdering());

		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
