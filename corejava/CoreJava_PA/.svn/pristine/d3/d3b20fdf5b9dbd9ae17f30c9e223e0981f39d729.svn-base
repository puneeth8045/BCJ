package com.crmindz.assignments.Collections.Maps.lab2;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/**
 * @author Puneeth In this class RareAge Getting the Key Value pairs from
 *         HashMap and displaying the rarest age in the of HashMap Entry.
 */
public class RareAge {
	public static void main(String[] args) {

		Map<String, Integer> age = new HashMap<String, Integer>();

		age.put("Alyssa", 22);
		age.put("Chat", 25);
		age.put("Dan", 25);
		age.put("Jeff", 20);
		age.put("Kasey", 20);
		age.put("Kim", 20);
		age.put("Morgan", 25);
		age.put("Ryan", 25);
		age.put("Stef", 22);

		RareAge rage = new RareAge();
		rage.rarest(age);
	}

	/**
	 * @param age
	 *            This param age represents the object of the HashMap.
	 */
	public void rarest(Map<String, Integer> age) {

		Collection<Integer> collect = age.values();// Adding the values of age
													// to Collection object
													// collect

		System.out.println("These are the total values in Insertion order" + collect + "\n");

		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());// Creating
																		// the
																		// object
																		// for
																		// Tree
																		// set
																		// of
																		// type
																		// Integer
																		// an
																		// passing
																		// MyComparator
																		// class
																		// for
																		// customized
																		// sorting.

		t.addAll(collect);

		System.out.println("Removing duplicates and Sorting the values " + t + "\n");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();// Creating
																		// the
																		// HashMap
																		// object
																		// map
																		// and
																		// passing
																		// the
																		// ages
																		// and
																		// number
																		// of
																		// times
																		// repeated.

		for (Integer a : t) {
			int count = 0;
			for (Integer b : collect) {

				if (a == b) {
					count++;
				}
			}
			map.put(a, count);
			System.out.println("Age " + a + "  " + "Number of times repeated " + count);
		}
		System.out.println("\n");
		TreeSet<Integer> tree = new TreeSet<Integer>();// Creating the object
														// for TreeSet class and
														// passing the Rarest
														// value to the map
														// object.

		for (Entry<Integer, Integer> i : map.entrySet()) {

			tree.addAll(map.values());

		}

		TreeSet<Integer> least = new TreeSet<Integer>();// Creating the object
														// for Treeset and
														// passing the key of
														// least repeated to the
														// least object.

		for (Entry<Integer, Integer> key : map.entrySet()) {
			if (key.getValue() == tree.first()) {
				least.add(key.getKey());
			}
		}
		System.out.println("Rarest age is :  " + least.first());
	}
}

/**
 * @author Puneeth In this class MyComparator implements Comparator for the use
 *         of Customised sorting.
 */
class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}
