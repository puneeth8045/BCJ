package com.crmindz.assignments.Collections.Lists.lab1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Puneeth In this test case passing the input variables by creating
 *         array list and passing the values to the method doubleList of class
 *         StringCopy.
 */
public class TestStringCopy {

	StringCopy scopy = new StringCopy();

	@Test
	public void test() {
		List<String> inputStrings = new ArrayList<String>();
		inputStrings.add("how");
		inputStrings.add("are");
		inputStrings.add("you?");

		List<String> outputStrings = new ArrayList<String>();
		outputStrings.add("how");
		outputStrings.add("how");
		outputStrings.add("are");
		outputStrings.add("are");
		outputStrings.add("you?");
		outputStrings.add("you?");

		assertEquals(outputStrings, scopy.doubleList(inputStrings));

	}
}
