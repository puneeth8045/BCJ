package com.crmindz.assignments.Collections.Sets.lab1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * @author Puneeth
 *
 */
public class TestCountCommon {

	@Test
	public void test() {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();
		// c1[3, 7, 3, -1, 2, 3, 7, 2, 15, 15]
		// c2[-5, 15, 2, -1, 7, 15, 36]

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

		assertEquals(4, CountCommon.countCommon(c1, c2));
	}

}
