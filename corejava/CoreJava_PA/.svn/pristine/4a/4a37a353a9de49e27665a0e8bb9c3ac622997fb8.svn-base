package com.crmindz.assignments.Oops.interfaces.lab2;

import java.util.Scanner;

/**
 * @author Puneeth This class implements the Charsequence interface
 */
public class CharImplementation implements CharSequence {
	public String string;

	public CharImplementation(String str) {
		this.string = str;
	}

	@Override
	public char charAt(int i) {

		if ((i < 0) || (i >= string.length())) {
			throw new StringIndexOutOfBoundsException(i);
		}
		return string.charAt(string.length() - 1 - i);
	}

	@Override
	public int length() {
		return string.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {

		StringBuilder sub = new StringBuilder(
				string.subSequence((string.length() - 1 - end), (string.length() - 1 - start)));
		return sub.reverse();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(this.string);
		return s.reverse().toString();
	}

	public static void main(String[] args) {

		System.out.println("Enter anything:");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		CharImplementation demo = new CharImplementation(str);

		System.out.println(demo.subSequence(3, 9));
		System.out.println(demo.charAt(0));
		System.out.println(demo.length());
		System.out.println(demo.toString());

		sc.close();
	}
}
