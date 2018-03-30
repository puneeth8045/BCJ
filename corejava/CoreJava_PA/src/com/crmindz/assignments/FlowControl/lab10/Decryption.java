package com.crmindz.assignments.FlowControl.lab10;

import java.util.Scanner;

/**
 * @author Puneeth This class will decrypt the encrypted input and will print
 *         the original integer.
 */
public class Decryption {
	/**
	 * This method will decrpt the encrypted input given as parameter and prints
	 * the original integer.
	 */
	public void doDecryption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be decrypted: ");
		int x = sc.nextInt();
		int y = x / 100;
		int z = x % 100;

		int a = y / 10;
		int p = ((a + 3) % 10) * 10;
		int b = y % 10;
		int q = ((b + 3) % 10);
		int c = z / 10;
		int r = ((c + 3) % 10) * 1000;
		int d = z % 10;
		int s = ((d + 3) % 10) * 100;

		int t = p + q + r + s;
		System.out.println(t);
		sc.close();

	}

	public static void main(String[] args) {
		Decryption d = new Decryption();
		d.doDecryption();
	}

}
