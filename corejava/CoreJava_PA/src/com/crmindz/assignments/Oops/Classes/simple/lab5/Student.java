package com.crmindz.assignments.Oops.Classes.simple.lab5;

/**
 * @author Puneeth Here in this class Student creating the properties and
 *         restricting them by private for student and giving them the access
 *         through setters and getters.
 */
public class Student {
	static int studentId;
	static char studentType;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public Student(int studentId, char studentType) {
		super();
		this.studentId = 1001;
		this.studentType = 'f';
	}

	public static void main(String[] args) {
		Student s = new Student(studentId, studentType);
		System.out.println("The student id is: " + s.getStudentId());
		System.out.println("The student Type is: " + s.getStudentType());

	}

}
