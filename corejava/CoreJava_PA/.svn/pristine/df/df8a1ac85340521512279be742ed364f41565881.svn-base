package com.crmindz.assignments.Collections.Lists.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Puneeth In this class StringCopy string variables given by the user
 *         must be repeated and displayed.
 */
public class StringCopy {
	/**
	 * @param al
	 *            This param al is the list of the String variables given by the
	 *            user.
	 * @return This method returns the List of type Strings in order to exicute
	 *         the jUnit test cases.
	 */
	public static List<String> doubleList(List<String> al) {

		for (int i = 0; i < al.size(); i = i + 2) {

			String word = al.get(i);
			al.add(i, word);

		}

		System.out.println("The value of the list is : " + al);

		return al;

	}

	static List<String> al = new ArrayList<String>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word : ");
		String value1 = sc.nextLine();
		al.add(value1);

		System.out.println("Please enter the second word : ");
		String value2 = sc.nextLine();
		al.add(value2);

		System.out.println("Please enter the Third word : ");
		String value3 = sc.nextLine();
		al.add(value3);

		StringCopy.doubleList(al);

	}
}
