package com.crmindz.assignments.Operators;

import java.util.HashSet;

public class ArrayDuplicateNum {

	public static void main(String[] args) {
		 int[] a = {0,3,1,2,3,1};
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(int b : a) {
			 if(!set.add(b)) {
				 System.out.println(b);
			 }
		 }

	}

}