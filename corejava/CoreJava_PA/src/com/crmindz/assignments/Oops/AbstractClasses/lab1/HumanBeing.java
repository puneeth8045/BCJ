package com.crmindz.assignments.Oops.AbstractClasses.lab1;

/**
 * @author Puneeth This is a concrete class which extends the LandMammaml class.
 */
public class HumanBeing extends LandMammal {

	/*
	 * The implementation of the parent class method walk.
	 */
	@Override
	public void walk() {
		System.out.println("Humans can walk");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.LandMammal#run()
	 * The implementation of the parent class run method.
	 */
	@Override
	public void run() {
		System.out.println("Humans can run");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.LandMammal#crawl()
	 * The implementation of the parent class method crawl.
	 */
	@Override
	public void crawl() {
		System.out.println("Humans can crawl");

	}

}
