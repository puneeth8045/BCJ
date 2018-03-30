package com.crmindz.assignments.Collections.Lists.lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Puneeth In this class ReverseStrings getting the values from
 *         stringBuffer and reverse the content in StringBuffer and displaying
 *         the value
 */
public class ReverseStrings {
	ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();

	/**
	 * @param sb
	 * @param sb1
	 * @param sb2
	 * @return
	 */
	public ArrayList<StringBuffer> storedValues(StringBuffer sb, StringBuffer sb1, StringBuffer sb2) {

		al.add(sb);
		al.add(sb1);
		al.add(sb2);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {

			System.out.print(itr.next() + ",");
		}

		return al;
	}

	public static void main(String[] args) {
		ReverseStrings revstr = new ReverseStrings();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word : ");
		String value = sc.nextLine();
		StringBuffer sb = new StringBuffer(value);
		sb.reverse();

		System.out.println("Please enter the second word : ");
		String value1 = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(value1);
		sb1.reverse();

		System.out.println("Please enter the Third word : ");
		String value2 = sc.nextLine();
		StringBuffer sb2 = new StringBuffer(value2);
		sb2.reverse();

		revstr.storedValues(sb, sb1, sb2);
		sc.close();
	}

}
