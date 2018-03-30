package com.crmindz.assignments.Collections.Maps.lab1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Puneeth In this class CityCount getting the count of the repeated
 *         values and display the count of each value.
 */
public class CityCount {
	int count = 0;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;

	public static void main(String[] args) {
		CityCount count = new CityCount();
		Map<String, String> city = new HashMap<String, String>();

		city.put("John", "Dallas");
		city.put("Babbar", "NewYork City");
		city.put("Akbar", "Houston");
		city.put("Rizwan", "Dallas");
		city.put("Jorge", "Paris");
		city.put("Roshan", "Dallas");
		city.put("Sujit", "Houston");

		count.countCity(city);

	}

	/**
	 * @param city
	 *            This Param city is nothing but the hast map object with all
	 *            the entry sets
	 */
	public void countCity(Map<String, String> city) {

		System.out.println("OUTPUT MAP");
		System.out.println("-------------------");

		for (String name : city.keySet())
			if (city.get(name).equalsIgnoreCase("Dallas")) {
				count++;

			}

			else if (city.get(name).equalsIgnoreCase("Houston")) {
				count1++;
			} else if (city.get(name).equalsIgnoreCase("Paris")) {
				count2++;
			} else if (city.get(name).equalsIgnoreCase("Newyork city")) {
				count3++;
			}
		System.out.println("Dallas - " + count);
		System.out.println("Houston - " + count1);
		System.out.println("Paris - " + count2);
		System.out.println("NewYork City - " + count3);

	}
}
