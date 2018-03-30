package com.crmindz.assignments.Operators;

import java.util.Arrays;

public class SubArray {

	public static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = inputArray[0];
		int start = 0;
		
		for(int i =1; i< inputArray.length;i++) {
			sum = sum + inputArray[i];
			if(sum > inputNumber && start <= i-1) {
				 sum = sum - inputArray[start];
				 start++;
			}
		
		 if(sum == inputNumber)
         {
             System.out.println("Input Array : "+Arrays.toString(inputArray));
              
             System.out.println("Input Number : "+inputNumber);
              
             System.out.print("Continuous Sub Array : ");

             for (int j = start; j <= i; j++)
             {
                 System.out.print(inputArray[j]+" ");
             }

             System.out.println();
         }
		}
		System.out.println("=================================");
	}
	public static void main(String[] args) {
		
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
	}

}
