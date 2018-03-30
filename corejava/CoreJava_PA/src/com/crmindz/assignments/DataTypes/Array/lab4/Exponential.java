package com.crmindz.assignments.DataTypes.Array.lab4;

/**
 * @author Puneeth This class will caluculate powers of given base to the given
 *         number and stores them in an array.
 */
public class Exponential {
	int Arr[];
	int Arr1[];

	/**
	 * @param n
	 * @return result array This method will calculate the powers of base 2 upto
	 *         the given number n and stores them in an array and retuns the
	 *         array.
	 */
	public int[] powerOfTwo(int n) {
		for (int i = 0; i < n; i++) {
			int a = (int) Math.pow(2, i);
			int Arr[] = { a };

			for (int j = 0; j < Arr.length; j++) {
				System.out.println(Arr[j]);
			}

		}
		return Arr;
	}

	/**
	 * @param base
	 * @param power
	 * @return result array This method will calculate the powers of given base
	 *         upto the given number n and stores them in an array and retuns
	 *         the array.
	 */
	public int[] power(int base, int power) {
		for (int i = 0; i < power; i++) {
			int b = (int) Math.pow(base, i);
			int Arr1[] = { b };

			for (int j = 0; j < Arr1.length; j++) {
				System.out.println(Arr1[j]);
			}
		}
		return Arr1;
	}

	public static void main(String[] args) {
		Exponential e = new Exponential();
		e.powerOfTwo(5);
		e.power(3, 5);

	}

}
