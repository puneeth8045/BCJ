package com.crmindz.assignments.Oops.Inheritance.lab6;

/**
 * @author Puneeth This class will inherit the Student class.
 */
public class Hostelite extends Student {
	String hostelName;
	int roomNumber;
	String roomType;

	/**
	 * @param studentId
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * @param permanentAddress
	 * @param hostelName
	 * @param roomNumber
	 * @param roomType
	 */
	public Hostelite(int studentId, String studentName, float qualifyingExamMarks, char residentialStatus,
			String branchName, int yearOfEngg, Address permanentAddress, String hostelName, int roomNumber,
			String roomType) {
		super(studentId, studentName, qualifyingExamMarks, residentialStatus, branchName, yearOfEngg, permanentAddress);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
