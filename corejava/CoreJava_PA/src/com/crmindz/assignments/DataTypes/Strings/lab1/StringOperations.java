package com.crmindz.assignments.DataTypes.Strings.lab1;

import java.util.StringTokenizer;

/**
 * @author Puneeth This class will declare and initialize various strings and
 *         perform different string manipulations.
 */
public class StringOperations {
	/**
	 * @param s
	 *            This method will count the number of words in the given
	 *            string. This method will perform replacement operation. This
	 *            method will get chars.
	 */
	public void stringOps(String s) {

		StringTokenizer st = new StringTokenizer(s);
		System.out.println("No of words in the string are " + st.countTokens());
		System.out.println("string length is: " + s.length());
		String replaceString = s.replace("hello", "HELLO");
		System.out.println("The String after replacement " + replaceString);
		String replaceAllString = s.replaceAll(" ", ",");
		System.out.println("The String after  replacement" + replaceAllString);
		char[] ch = new char[10];
		s.getChars(0, 3, ch, 0);
		System.out.println("The first three characters of the string are:");
		System.out.println(ch);
	}

	/**
	 * @param s1
	 * @param s2
	 *            This method will check whether the given strings are equal or
	 *            not and returns true or false.
	 */
	public void compareto(String s1, String s2) {
		System.out.println("Comparision between the strings:" + s1.equals(s2));
	}

	/**
	 * @param s3
	 *            This method will check whether a given string is equal from
	 *            both directions or not and returns true or false.
	 */
	public void equalBothDirections(String s3) {
		String s4 = new StringBuffer(s3).reverse().toString();
		System.out.println("Comparision of string in both directions:" + s3.equals(s4));
	}

	/**
	 * @param s
	 *            This method will check the for a letter.
	 */
	public void findA(String s) {
		int index = s.indexOf("A");
		while (index >= 0) {
			System.out.println("The letter A appears at: " + index);
			index = s.indexOf("A", index + 1);
		}

	}

	/**
	 * @param s
	 *            This method will replace the words in the string.
	 */
	public void checkString(String s) {

		if (s.contains("institute")) {
			String s7 = s.replaceFirst("ins", "JSS");
			System.out.println("The updated string is : " + s7);
		} else {
			System.out.println("There is no institute in the String");
		}
	}

	public static void main(String[] args) {
		String s = "hello how are you?";
		StringOperations o = new StringOperations();
		o.stringOps(s);
		String s1 = "HELLO";
		String s2 = "hello";
		o.compareto(s1, s2);
		String s3 = "NITIN";
		o.equalBothDirections(s3);
		String s5 = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		o.findA(s5);
		String s6 = "This  is a java institute of insurance and insu.";
		o.checkString(s6);
	}

}
