package com.crmindz.assignments.Oops.MethodOverloading.lab2;

import java.util.Date;

/**
 * @author Puneeth This class will demonstrate constructor overloading.
 */
public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	Date dateofBirth;

	/**
	 * @param firstName
	 */
	public Employee(String firstName) {
		super();
		this.firstName = firstName;
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 */
	public Employee(String firstName, String lastName, int employeeId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 * @param dateofBirth
	 */
	public Employee(String firstName, String lastName, int employeeId, Date dateofBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.dateofBirth = dateofBirth;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Puneeth");
		Employee e1 = new Employee("Puneeth", "Reddy");
		Employee e2 = new Employee("Puneeth", "Reddy", 102);
		Employee e3 = new Employee("Puneeth", "Reddy", 102, new Date(1993 - 12 - 17));

		System.out.println(e.firstName);
		System.out.println(e1.firstName + e1.lastName);
		System.out.println(e2.firstName + e2.lastName + e2.employeeId);
		System.out.println(e3.firstName + e3.lastName + e3.employeeId + e3.dateofBirth);

	}

}
