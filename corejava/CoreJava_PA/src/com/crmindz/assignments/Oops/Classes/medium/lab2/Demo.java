package com.crmindz.assignments.Oops.Classes.medium.lab2;

/**
 * @author Puneeth Class to demonstrate performance of employee entity class
 */
public class Demo {

	public static void main(String[] args) {
		Employee emp = new Employee("Puneeth", "Reddy", 10001.0);
		Employee emp1 = new Employee("kumar", "Reddy", 1116.6);

		emp.yearlySalary();
		emp1.yearlySalary();

	}

}
