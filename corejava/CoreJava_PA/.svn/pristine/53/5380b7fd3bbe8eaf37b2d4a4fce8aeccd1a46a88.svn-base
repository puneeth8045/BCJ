package com.crmindz.assignments.DataTypes.Array.lab1;

/**
 * @author Puneeth This class will perform various operations on an integer
 *         array and prints the results.
 */
public class ArrayOperations {

	/**
	 * @param numbersArray
	 *            This method will print all the odd numbers in the given array.
	 */
	public void printOddNumbers(int numbersArray[]) {
		System.out.println("The odd numbers in array are");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 1) {
				System.out.println(numbersArray[i]);
			}
		}
	}

	/**
	 * @param numbersArray
	 *            This method will add 2 to all the even numbers in the given
	 *            array. Stores the values in a new array and prints the array.
	 */
	public void printNewArray(int numbersArray[]) {
		System.out.println("The new array is");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 == 0) {
				numbersArray[i] = numbersArray[i] + 2;
			} else {
				numbersArray[i] = numbersArray[i];
			}
			System.out.println(numbersArray[i]);
		}

	}

	/**
	 * @param numbersArray
	 *            This method will print all the numbers which are divisible by
	 *            3 in the given array.
	 */
	public void printNumbersDiv3(int numbersArray[]) {
		System.out.println("Numbers divisible by 3 ");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 3 == 0) {
				System.out.println(numbersArray[i]);
			}
		}

	}

	/**
	 * @param numbersArray
	 *            This method will print average of all the numbers in the given
	 *            array.
	 */
	public void printAvg(int numbersArray[]) {
		int sum = 0;
		System.out.println("The Avg of the numbers in the array is: ");

		for (int i = 0; i < numbersArray.length; i++) {
			sum = sum + numbersArray[i];
		}
		int avg = sum / 10;
		System.out.println(avg);

	}

	/**
	 * @param numbersArray
	 *            This method will print highest number in the given array.
	 */
	public void printLowestNumber(int numbersArray[]) {
		System.out.println("Lowest number in array is: ");
		int min = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (min > numbersArray[i]) {
				min = numbersArray[i];

			}

		}
		System.out.println(min);
	}

	/**
	 * @param numbersArray
	 *            This method will print highest number in the given array.
	 */
	public void printHighestNumber(int numbersArray[]) {
		System.out.println("Highest number in array is: ");
		int max = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (max < numbersArray[i]) {
				max = numbersArray[i];

			}

		}
		System.out.println(max);

	}

	public void printNumbersLessAvg(int numbersArray[]) {
		System.out.println("Numbers less than average :");
		int sum = 0;

		for (int i = 0; i < numbersArray.length; i++) {
			sum = sum + numbersArray[i];
		}
		int avg = sum / 10;

		for (int i = 0; i < numbersArray.length; i++) {
			if (avg > numbersArray[i]) {
				System.out.println(numbersArray[i]);
			}
		}

	}

	public static void main(String[] args) {
		ArrayOperations a = new ArrayOperations();
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		a.printOddNumbers(numbersArray);
		a.printNewArray(numbersArray);
		a.printNumbersDiv3(numbersArray);
		a.printAvg(numbersArray);
		a.printHighestNumber(numbersArray);
		a.printLowestNumber(numbersArray);
		a.printNumbersLessAvg(numbersArray);
	}

}
