package com.crmindz.assignments.FlowControl.lab8;

import java.util.Scanner;

/**
 * @author Puneeth This class will print the hollow square with side specified
 *         by the user between 1 and 20.
 */
public class AsterisksSquare {
	/**
	 * This method will take the side of the square as input and prints the
	 * hollow square with the side specified.
	 */
	public void printSquare() {
		String star = "*";
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x = sc.nextInt();
		int y = x + 2;
		int z = y + x - 1;
		while (c <= y) {

			System.out.print(star + " ");
			c++;
		}

		while (a <= x) {
			System.out.print("\n" + star);
			while (b <= z) {
				System.out.print(" ");
				b++;
			}
			System.out.print(star);
			a++;
			b = 1;
		}
		System.out.print("\n");
		while (d <= y) {
			System.out.print(star + " ");

			d++;
		}
		sc.close();
	}

	public static void main(String[] args) {
		AsterisksSquare as = new AsterisksSquare();
		as.printSquare();

	}

}
