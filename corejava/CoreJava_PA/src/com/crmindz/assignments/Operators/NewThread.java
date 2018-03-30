package com.crmindz.assignments.Operators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NewThread {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int f = s.nextInt();
		Set<String> d = new TreeSet<String>();
		System.out.println("Enter the input:");
		for(int i = 0;i<=f;i++) {
		if(s.hasNext()) {
			d.add(s.nextLine());
		}
	}
		Iterator<String> itr = d.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
    }
		
		
		
	
	





	
	
