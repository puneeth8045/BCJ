package com.crmindz.assignments.Collections.Lists.lab2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Puneeth This class will display a given list from forward and
 *         backward direction and also adds banana in between the tangerine and
 *         strawberry in the list.
 */
public class Fruits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fruits fru = new Fruits();

		System.out.println("Please enter the list of fruits : ");
		String fruits = sc.nextLine();

		fru.listOfFruits(fruits);

	}

	/**
	 * @param fruits
	 *            This param fruits is the list of fruits given by the user.
	 */
	public void listOfFruits(String fruits) {

		List<String> al = new ArrayList<String>();

		String[] seperator = fruits.split(",");

		for (int i = 0; i < seperator.length; i++) {

			al.add(seperator[i]);

		}

		Iterator<String> itr = al.iterator();

		System.out.println("Traversing the fruit list in forward direction");

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("\n");
		ListIterator<String> ltr = al.listIterator(al.size());

		System.out.println("Traversing the fruit list in reverse direction");

		while (ltr.hasPrevious()) {

			System.out.println(ltr.previous());
		}
		System.out.println("\n");
		System.out.println("Traversing the fruit list in forward direction and adding banana ");

		// al.add(3, "banana");

		ListIterator<String> altr = al.listIterator();

		while (altr.hasNext()) {

			String temp = altr.next();

			if (temp.equalsIgnoreCase("tangerine")) {
				System.out.println(temp);
				altr.add("banana");
				altr.previous();
			} else {
				System.out.println(temp);
			}

		}

	}
}
