package com.crmindz.assignments.Oops.Classes.medium.lab2;

/**
 * @author Puneeth Entity class for employee
 */
public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	/**
	 * This method calculates the yearly salary.
	 */
	public void yearlySalary() {
		if (monthlySalary > 0) {
			double yearlySalary = 12 * monthlySalary;
			System.out.println("The yearly Salary is: " + yearlySalary);
			yearlySalary += yearlySalary * .10;
			System.out.println("The Salary after bonus is: " + yearlySalary);
			System.out.println("--------------------------------");
		} else {
			monthlySalary = 0.0;
		}
	}

	/**
	 * This method calculates the yearly salary with bonus.
	 */
	public void salaryBonus() {
		monthlySalary += monthlySalary * 0.10;

	}
}
