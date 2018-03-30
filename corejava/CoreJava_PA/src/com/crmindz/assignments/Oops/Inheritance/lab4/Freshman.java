package com.crmindz.assignments.Oops.Inheritance.lab4;

/**
 * @author Puneeth This class inherits the UnderGradStudent class.
 */
public class Freshman extends UnderGraduateStudent {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.crmindz.assignments.Oops.Inheritance.lab4.UnderGraduateStudent#exam()
	 */
	public void exam() {
		super.exam();
	}

	public static void main(String[] args) {
		Freshman fm = new Freshman();
		fm.exam();
	}
}
