package com.crmindz.assignments.Operators.lab1;

/**
 * @author Puneeth This class will calculate calculate how much the investment
 *         $40,000 would in three years.
 */
public class Investment3Years {
	double investment = 14000;

	/**
	 * This method will calculate how much the investment $40,000 would in three
	 * years
	 */
	public void interestCalculation() {
		System.out.println("Initial investment :" + investment);
		double investment1 = investment + investment * .4;
		System.out.println("Investment after 1 year : " + investment1);
		double investment2 = investment1 - 1500;
		System.out.println("Investment after 2 year : " + investment2);
		double investment3 = investment2 + investment2 * .12;
		System.out.println("Investment after 3 year : " + investment3);
	}

	public static void main(String[] args) {
		Investment3Years i = new Investment3Years();
		i.interestCalculation();
	}

}
