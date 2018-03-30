package com.crmindz.assignments.Oops.AbstractClasses.lab1;

/**
 * @author Puneeth This is a concrete class which extends the WaterMammal class.
 */
public class Whale extends WaterMammal {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.WaterMammal#swim()
	 * The implementation of the parent class method swim.
	 */
	@Override
	void swim() {
		System.out.println("Whale can swim");

	}

}
