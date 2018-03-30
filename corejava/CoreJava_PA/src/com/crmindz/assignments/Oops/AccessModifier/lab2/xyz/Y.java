package com.crmindz.assignments.Oops.AccessModifier.lab2.xyz;

import com.crmindz.assignments.Oops.AccessModifier.lab2.abc.A;

/**
 * @author Puneeth This class will import the class A and try to access the
 *         instance variables of A.
 */
public class Y extends X {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);

	}

}
