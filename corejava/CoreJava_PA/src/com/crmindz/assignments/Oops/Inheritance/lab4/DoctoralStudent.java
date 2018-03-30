package com.crmindz.assignments.Oops.Inheritance.lab4;

public class DoctoralStudent extends GraduateStudent{
   public  void exam(){
	   System.out.println("I dont have any exams!!!");
   }
   public static void main(String[]args){
	   DoctoralStudent ds = new DoctoralStudent();
	   ds.exam();
   }
}
