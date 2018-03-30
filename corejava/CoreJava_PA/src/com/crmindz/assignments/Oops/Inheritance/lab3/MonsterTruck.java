package com.crmindz.assignments.Oops.Inheritance.lab3;

/**
 * @author Puneeth This class will inherit the Truck class and overrides the
 *         methods.
 */
public class MonsterTruck extends Truck {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Truck#m1() This method
	 * is overrided method from class Truck
	 */
	public void m1() {
		System.out.println("monster 1");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Truck#m2() This method
	 * is overrided method from class Truck
	 */
	public void m2() {
		super.m1();
		super.m2();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.Inheritance.lab3.Truck#toString() This
	 * method is overrided method from class Truck
	 */
	public String toString() {
		return "monster " + super.toString();

	}

	public static void main(String[] args) {
		MonsterTruck mt = new MonsterTruck();
		mt.m1();
		mt.m2();
		System.out.println(mt);

	}

}
