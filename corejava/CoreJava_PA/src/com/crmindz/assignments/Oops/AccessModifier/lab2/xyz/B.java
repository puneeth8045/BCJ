package com.crmindz.assignments.Oops.AccessModifier.lab2.xyz;

import com.crmindz.assignments.Oops.AccessModifier.lab2.abc.A;

/**
 * @author Puneeth This class will inherit the class A and access the instance
 *         variables of A.
 */
public class B extends A {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);

	}
}
