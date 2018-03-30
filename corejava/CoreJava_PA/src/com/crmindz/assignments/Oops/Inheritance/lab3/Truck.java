package com.crmindz.assignments.Oops.Inheritance.lab3;

/**
 * @author Puneeth This class inherits the Car class and overrides the methods
 *         from Car.
 */
public class Truck extends Car {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Car#m1() This method
	 * is overrided method from class Car
	 */
	public void m1() {
		System.out.println("truck 1");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Car#m2() This method
	 * is overrided method from class Car
	 */
	public void m2() {
		super.m1();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Car#toString() This
	 * method is overrided method from class Car
	 */
	public String toString() {
		return super.toString() + super.toString();
	}
}
