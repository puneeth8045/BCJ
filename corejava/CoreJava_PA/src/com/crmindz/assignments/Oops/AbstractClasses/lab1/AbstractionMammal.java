package com.crmindz.assignments.Oops.AbstractClasses.lab1;

/**
 * @author Puneeth This is a class where all implementation is done.
 */
public class AbstractionMammal {

	public static void main(String[] args) {
		LandMammal lm1 = new Lion();
		lm1.crawl();
		lm1.run();
		lm1.walk();

		LandMammal lm2 = new HumanBeing();
		lm2.crawl();
		lm2.run();
		lm2.walk();

		WaterMammal wm = new Whale();
		wm.swim();

	}

}
