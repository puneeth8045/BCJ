package com.crmindz.assignments.Oops.Classes.simple.lab2;

/**
 * @author Puneeth This class is used to get the id and student type.
 */
public class CourseManagement {

	public static void main(String[] args) {
		char fresher = 'F';
		char lateral = 'L';
		Student student = new Student();

		student.setStudentId(99);
		student.setStudentType(lateral);

		System.out.println("Student id: " + student.getStudentId());
		System.out.println("StudentType: " + student.getStudentType());

	}

}
