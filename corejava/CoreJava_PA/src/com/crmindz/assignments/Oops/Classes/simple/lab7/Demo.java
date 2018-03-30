package com.crmindz.assignments.Oops.Classes.simple.lab7;

/**
 * @author Puneeth In this class getting the values from user and printing the
 *         properties of cuboid.
 */
public class Demo {

	public static void main(String[] args) {
		Cuboid c = new Cuboid();
		c.setLength(10);
		c.setWidth(20);
		c.setHeight(25);

		System.out.println("The length of the cuboid is: " + c.getLength());
		System.out.println("The width of the cuboid is: " + c.getWidth());
		System.out.println("The height of the cuboid is: " + c.getHeight());

	}

}
