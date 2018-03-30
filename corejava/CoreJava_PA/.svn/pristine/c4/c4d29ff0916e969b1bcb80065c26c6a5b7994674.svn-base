package com.crmindz.assignments.Collections.Lists.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Puneeth In this class ReverseOddEven Swapping the even variables and
 *         odd variables and displaying the results.
 */
public class ReverseOddEven {
	static ArrayList<String> al = new ArrayList<String>();

	public static ArrayList<String> manupulation(String words) {

		String[] separator = words.split(",");

		for (int i = 0; i < separator.length; i++) {

			al.add(separator[i]);

		}

		System.out.println(al);
		for (int i = 0; i < al.size() - 1; i = i + 2) {

			String word = al.get(i);
			al.remove(i);
			al.add(i + 1, word);

		}
		System.out.println("The final format is : " + al);

		return al;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the word : ");
		String words = sc.nextLine();
		ReverseOddEven.manupulation(words);

	}
}
