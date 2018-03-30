package com.crmindz.assignments.Collections.Comparator.lab1;

import java.util.Comparator;

/**
 * @author Puneeth In this Class BackwardOrdering that implements the Comparator
 *         interface such that integers are ordered in reverse from their usual
 *         ordering.
 */
public class BackwardOrdering {
	/**
	 * @param obj1
	 * @param obj2
	 * @return implementing the method in the Comparator interface
	 */
	public int compare(Object obj1, Object obj2) {

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		return -i1.compareTo(i2);

	}
}

/**
 * @author Puneeth Class AlternateOrdering that implements the Comparator
 *         interface such even that positive numbers are ordered as usual, but
 *         negative numbers are ordered in reverse.
 */
class AlternateOrdering implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) {

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 >= 0 && i2 >= 0) {

			return i1.compareTo(i2);
		} else if (i1 <= 0 && i2 <= 0) {
			return -i1.compareTo(i2);
		}
		return 0;

	}

}
