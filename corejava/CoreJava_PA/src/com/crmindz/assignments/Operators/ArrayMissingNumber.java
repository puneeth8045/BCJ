package com.crmindz.assignments.Operators;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		
		int Array[] = {1,2,3,5,6,7,8,9};
		int count = 10;
		int missingCount = count - Array.length;
		int a=0;
		
		
		
		for(int j =1; j<=missingCount;j++) {
			for(int i =a ; i<Array.length;i++) {
				if(Array[i]!=i+j) {
					a = i;
					System.out.println(i+j);
					break;
				
			}
			
		}
			
	} if(Array[Array.length-1]!=count) {
		System.out.println(count);
	}
		
	}
}
