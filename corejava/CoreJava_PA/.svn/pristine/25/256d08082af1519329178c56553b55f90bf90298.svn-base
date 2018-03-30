package com.crmindz.assignments.DataTypes.Strings.lab4;

/**
 * @author Puneeth This class will find the sum of individual digits of each
 *         number given as input and gives an array containing the numbers with
 *         maximum sum of digits.
 */
public class MaxOfNumbers {
	/**
	 * @return array of numbers with maximum sum of digits This method will take
	 *         a string input and splits the input into individual numbers and
	 *         finds the sum of digits for every number and returns an array of
	 *         numbers with maximum sum of digits.
	 */
	public static String[] findMax() {

		String input = "324, 457, 112, 259, 323, 222";
		int number = 0, max = 0, j = 0, count = 0;

		String[] array = input.split(",");
		int[] sumArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			number = Integer.parseInt((array[i].trim()));
			int sum = 0;

			while (number > 0) {
				sum += number % 10;
				number = number / 10;
			}
			sumArray[i] = sum;

			if (sum > max)
				max = sum;
		}

		for (int i = 0; i < sumArray.length; i++) {

			if (sumArray[i] >= max) {
				count++;
				max = sumArray[i];
			}
		}

		String[] resultArray = new String[count];

		for (int i = 0; i < sumArray.length; i++) {

			if (sumArray[i] >= max) {
				resultArray[j] = array[i];
				j++;
			}
		}

		return resultArray;

	}

	public static void main(String[] args) {

		String[] result = findMax();

		for (int i = 0; i < result.length; i++)
			System.out.print(result[i]);
	}

}
