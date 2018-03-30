package com.crmindz.assignments.FlowControl.lab10;

import java.util.Scanner;

/**
 * @author Puneeth This class will encrypt the given input and will print the
 *         decrypted integer.
 */
public class Encryption {
	/**
	 * This method will encrypt input given as parameter and prints the
	 * decrypted integer.
	 */
	public void doEncryption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 digit number: ");
		int x = sc.nextInt();
		int y = x / 100;
		int z = x % 100;

		int a = y / 10;
		int p = ((a + 7) % 10) * 10;
		int b = y % 10;
		int q = ((b + 7) % 10);
		int c = z / 10;
		int r = ((c + 7) % 10) * 1000;
		int d = z % 10;
		int s = ((d + 7) % 10) * 100;

		int t = p + q + r + s;
		System.out.println(t);
		sc.close();
	}

	public static void main(String[] args) {
		Encryption e = new Encryption();
		e.doEncryption();
	}

}
