package com.crmindz.assignments.Collections.Sets.lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Puneeth In this class CommonDigitSearch return 4 because the elements
 *         -1, 2, 7, and 15 occur in both collections.
 */
public class CountCommon {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();
		c1.add(3);
		c1.add(7);
		c1.add(3);
		c1.add(-1);
		c1.add(2);
		c1.add(3);
		c1.add(7);
		c1.add(2);
		c1.add(15);
		c1.add(15);

		c2.add(-5);
		c2.add(15);
		c2.add(2);
		c2.add(-1);
		c2.add(7);
		c2.add(15);
		c2.add(36);

		System.out.println(CountCommon.countCommon(c1, c2));

	}

	/**
	 * @param c1
	 *            param c1 is first collection object.
	 * @param c2
	 *            param c2 is Second collection object.
	 * @return This repeats 4 because the elements -1, 2, 7, and 15 occur in
	 *         both collections.
	 */
	public static int countCommon(Collection c1, Collection c2) {

		TreeSet t1 = new TreeSet(c1);
		TreeSet t2 = new TreeSet(c2);
		Iterator itr = t1.iterator();

		int count = 0;

		while (itr.hasNext()) {
			if (t2.contains(itr.next())) {
				count++;
			}
		}

		return count;

	}
}
