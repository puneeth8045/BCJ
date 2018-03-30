package com.crmindz.assignments.Oops.AbstractClasses.lab1;

/**
 * @author Puneeth This is a concrete class which extends the LandMammaml class.
 */
public class Lion extends LandMammal {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.LandMammal#walk()
	 * The implementation of the parent class walk method.
	 */
	void walk() {
		System.out.println("Lion can walk");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.LandMammal#run()
	 * The implementation of the parent class run method.
	 */
	@Override
	void run() {
		System.out.println("Lion can run");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.crmindz.assignments.Oops.AbstractClasses.lab1.LandMammal#crawl()
	 * The implementation of the parent class method crawl.
	 */
	@Override
	void crawl() {
		System.out.println("Lion can crawl");

	}

}
