package com.crmindz.assignments.Oops.Inheritance.lab4;

/**
 * @author Puneeth This class inherits the UnderGraduateStudent class.
 */
public class Senior extends UnderGraduateStudent {
	public void exam() {
		super.exam();
	}

	public static void main(String[] args) {
		Senior senior = new Senior();
		senior.exam();
	}
}
