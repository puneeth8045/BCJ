package com.crmindz.assignments.JavaLang.lab18;

/**
 * @author Puneeth This class is an entity class of student.
 */
public class Student {
	String studentName;
	String branchName;
	int studentid;
	double qualifyingExamMarks;
	char residentialStatus;
	String yearOfEngg;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public double getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(double qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public String getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(String yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	/**
	 * @return This method is used to validate the student name.
	 */
	public boolean validateStudentName() {
		if (studentName.length() >= 5 && studentName.length() <= 25) {
			return true;
		} else {
			System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
			return false;
		}

	}

	/**
	 * @return This method is used to validate the branch.
	 */
	public boolean validateBranchName() {
		if (branchName == "CSE" || branchName == "ECE" || branchName == "EEE" || branchName == "MECH"
				|| branchName == "Bio-Tech") {
			return true;
		} else {
			branchName = "CSE";
			System.out.println("Invalid Branch Name, set to CSE");
			return false;
		}

	}

	/**
	 * This method is used to validate the marks.
	 */
	public void validateExamMarks() {

		if ((validateStudentName() == true) && (validateBranchName() == true)) {
			if ((qualifyingExamMarks >= 65) && (qualifyingExamMarks <= 100)) {
				System.out.println("Student id :" + getStudentid());
				System.out.println("Student Name: " + getStudentName());
				System.out.println("Qualifying Marks :" + getQualifyingExamMarks());
				System.out.println("Residential Status :" + getResidentialStatus());
				System.out.println("Current Year of Engineering :" + getYearOfEngg());
				System.out.println("Branch Name :" + getBranchName());

			} else {
				System.out.println("Invalid marks, the range of marks is between 65 and 100");
			}
		}
	}

}