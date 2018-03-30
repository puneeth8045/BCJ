package com.crmindz.assignments.Collections.Sets.lab2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Puneeth In this class Fruit we are manupulating the Set by passing
 *         the data and clear the data in Set.
 */
public class FruitSet {
	String fruit1 = "pear";
	String fruit2 = "banana";
	String fruit3 = "tangerine";
	String fruit4 = "strawberry";
	String fruit5 = "blackberry";

	/**
	 * Manupulating Set
	 */
	public void displaySetOperations() {

		Set mySet = new HashSet();

		mySet.add(fruit1);
		mySet.add(fruit2);
		mySet.add(fruit3);
		mySet.add(fruit2);
		mySet.add(fruit4);
		mySet.add(fruit5);

		System.out.println("mySet now contains:");
		System.out.println(mySet);

		System.out.println("number of elements=" + mySet.size());

		mySet.remove(fruit5);
		mySet.remove(fruit4);

		System.out.println("blackberry and strawberry removed; mySet now contains:");
		System.out.println(mySet);

		mySet.clear();
		System.out.println("mySet has been cleared");

		if (mySet.isEmpty())
			System.out.println("mySet is now empty.");
		else
			System.out.println("mySet is not empty:");

	}

	public static void main(String[] args) {
		FruitSet f = new FruitSet();
		f.displaySetOperations();
	}

}
