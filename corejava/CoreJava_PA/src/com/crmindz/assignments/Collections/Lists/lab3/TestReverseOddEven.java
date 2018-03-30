package com.crmindz.assignments.Collections.Lists.lab3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author Puneeth In this class TestReverseOddEven passing the String value and
 *         verifying the output of the test case.
 */
public class TestReverseOddEven {

	@Test
	public void test() {
		String words = "how,are,you,i,am,doing,good";

		ArrayList<String> outputStrings = new ArrayList<String>();

		outputStrings.add("are");
		outputStrings.add("how");
		outputStrings.add("i");
		outputStrings.add("you");
		outputStrings.add("doing");
		outputStrings.add("am");
		outputStrings.add("good");

		assertEquals(outputStrings, ReverseOddEven.manupulation(words));
	}

}
