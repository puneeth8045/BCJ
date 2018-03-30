package com.crmindz.assignments.Oops.Inheritance.lab6;

/**
 * @author Puneeth Class Student is superclass consisting of student data.
 */
public class Student {
	int studentId;
	String studentName;
	float qualifyingExamMarks;
	char residentialStatus;
	String branchName;
	int yearOfEngg;
	Address permanentAddress;
	static int studentCounter;

	public Student() {
		super();
	}

	/**
	 * @param studentId
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * @param permanentAddress
	 */
	public Student(int studentId, String studentName, float qualifyingExamMarks, char residentialStatus,
			String branchName, int yearOfEngg, Address permanentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.branchName = branchName;
		this.yearOfEngg = yearOfEngg;
		this.permanentAddress = permanentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public static int getStudentCounter() {
		return studentCounter;
	}

	/**
	 * @return This method will validate the student name and return true or
	 *         false.
	 */
	public boolean validateStudentName() {
		if (getStudentName().length() >= 5 && getStudentName().length() <= 25) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return This method will validate the branch name and return true or
	 *         false.
	 */
	public boolean validateBranchName() {
		if (getBranchName() == "CSE" || getBranchName() == "ECE" || getBranchName() == "EEE"
				|| getBranchName() == "MECH" || getBranchName() == "Bio-Tech") {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return This method will validate the exam marks and return true or
	 *         false.
	 */
	public boolean validateExamMarks() {
		if ((getQualifyingExamMarks() >= 65) && (getQualifyingExamMarks() <= 100)) {
			return true;
		} else {
			return false;
		}

	}

}
