package com.crmindz.assignments.Oops.Classes.simple.lab3;

/**
 * @author Puneeth This class is used to set and get the details of the student.
 */
public class Employee {
	static int employeeid;
	char gender;
	float allowances;
	double basicSalary;
	static Employee emp = new Employee(employeeid);

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getAllowances() {
		return allowances;
	}

	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Employee(int employeeid) {
		super();
		this.employeeid = 1;
	}

	public void setEmployeeDetails() {

		emp.setGender('F');
		emp.setBasicSalary(99.9);
		emp.setAllowances(150);

	}

	/**
	 * This method is used get the employee details.
	 */
	public void getEmployeeDetails() {
		System.out.println("The Employee id is: " + employeeid);
		System.out.println("The gender of the employee is :" + emp.getGender());
		System.out.println("The salary is :" + emp.getBasicSalary());
		System.out.println("The allowance of the employee is:" + emp.getAllowances());

	}

	public static void main(String[] args) {

		emp.setEmployeeDetails();
		emp.getEmployeeDetails();
	}
}
