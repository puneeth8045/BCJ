package com.crmindz.assignments.Operators;

import java.util.Arrays;

public class Anagram {
	public void anagram(String a, String b) {
		char[] a1 = a.toCharArray();
		Arrays.sort(a1);
		char[] b1 = b.toCharArray();
		Arrays.sort(b1);
		
		if(Arrays.equals(a1, b1)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

	public static void main(String[] args) {
		Anagram ana = new Anagram();
		ana.anagram("army", "mary");
	}

}