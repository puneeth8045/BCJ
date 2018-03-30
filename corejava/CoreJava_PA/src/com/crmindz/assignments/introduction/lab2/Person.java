package com.crmindz.assignments.introduction.lab2;

import java.util.Scanner;

/**
 * @author Puneeth
 *This class takes input from user using Scanner class and prints details.
 */
public class Person {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String firstname;
		String lastname;
		int age;

		System.out.print("firstname: ");
		firstname = scan.nextLine();
		System.out.print("lastname: ");
		lastname = scan.nextLine();
		System.out.print("age: ");
		age = scan.nextInt();

		System.out.println("Firstname: " + firstname);
		System.out.println("Lastname: " + lastname);
		System.out.println("Age" + age);
		scan.close();

	}

}
