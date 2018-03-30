package com.crmindz.assignments.introduction.lab;

/**
 * @author Puneeth
 *This class invokes a method which contains name, city and state as parameters
 *and displays employee details.
 *invokes a method which contains number1 and number2 as parameters and displays addition of two numbers.
 */
public class DemoRefactorMethod {

	public static void giveDetails(String name,String city,String state){
		System.out.println("Hello, My name is " + name);
	    
		System.out.println("I live in "+city+"," +state);
		    
		System.out.println("I am a java instructor");
		    
		System.out.println("I work for Nivtek");	
	}
	public static void addIntegers(int i,int j){
		int k= i + j;
		System.out.println(k);
	}

	public static void main(String[] args) {
		
		for(int i=0; i<=2;i++){
			DemoRefactorMethod.giveDetails("Boot Camp","Dallas","TX");
		}
		
		DemoRefactorMethod.addIntegers(5, 6);
		DemoRefactorMethod.addIntegers(4, 7);
		

	}

}
