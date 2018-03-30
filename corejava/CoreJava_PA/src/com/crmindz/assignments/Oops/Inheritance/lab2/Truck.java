package com.crmindz.assignments.Oops.Inheritance.lab2;

public class Truck extends Car {
	
	public void m1() {
        System.out.println("truck 1");
    }
public static void main(String[] args){
	Car mycar = new Car();
	Truck mytruck = new Truck();
	System.out.println(mycar);	
	mycar.m1();	
	mycar.m2();	
	System.out.println(mytruck);	
	mytruck.m1();	
}
}
