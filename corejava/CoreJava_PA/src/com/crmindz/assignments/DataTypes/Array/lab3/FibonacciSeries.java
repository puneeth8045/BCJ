package com.crmindz.assignments.DataTypes.Array.lab3;

import java.util.Scanner;

/**
 * @author Puneeth This class will generate the Fibonacci Series upto the number
 *         given by the user.
 */
public class FibonacciSeries {
	int Arr[];

	/**
	 * @param n
	 * @return int array This method will store the result of Fibonacci series
	 *         upto the given number in an array and returns the array of
	 *         Fibonnaci Series.
	 */
	public int[] fibonacci(int n) {

		int n1 = 0, n2 = 1, n3;
		for (int i = 0; i < n; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			int Arr[] = { n3 };

			for (int j = 0; j < Arr.length; j++) {
				System.out.print(Arr[j]);

			}

		}
		return Arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n =");
		int x = sc.nextInt();

		FibonacciSeries a = new FibonacciSeries();
		a.fibonacci(x);
		sc.close();

	}

}
