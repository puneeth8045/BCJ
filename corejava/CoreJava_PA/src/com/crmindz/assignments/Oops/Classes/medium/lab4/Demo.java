package com.crmindz.assignments.Oops.Classes.medium.lab4;

/**
 * @author Puneeth Class Demo to demonstrate the working of student class
 */
public class Demo {
	static Student studentone = new Student();
	static Student studenttwo = new Student();

	public static void main(String[] args) {
		studentone.setStudentid(1001);
		studentone.setStudentName("Jackson");
		studentone.setQualifyingExamMarks(95.0f);
		studentone.setResidentialStatus('D');
		studentone.setYearOfEngg("2");
		studentone.setBranchName("CSE");
		studentone.validateStudentName();
		studentone.validateBranchName();
		studentone.validateExamMarks();

		studenttwo.setStudentid(1002);
		studenttwo.setStudentName("Jen");
		studenttwo.setQualifyingExamMarks(68.0f);
		studenttwo.setResidentialStatus('H');
		studenttwo.setYearOfEngg("3");
		studenttwo.setBranchName("ABC");
		studenttwo.validateStudentName();
		studenttwo.validateBranchName();
		studenttwo.validateExamMarks();

	}

}
