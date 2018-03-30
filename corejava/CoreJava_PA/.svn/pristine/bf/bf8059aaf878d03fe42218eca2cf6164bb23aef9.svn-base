package com.crmindz.assignments.Oops.Inheritance.lab6;

/**
 * @author Puneeth This class is the demo class for inheritance.
 */
public class DemoInherit {

	public static void main(String[] args) {
		Address ad1 = new Address();
		ad1.setAddressLine("8231 carpenter pkwy");
		ad1.setCity("Irving");
		ad1.setState("Texas");
		ad1.setZip("75038");
		Hostelite h = new Hostelite(12, "Tommy", 75.6f, 'H', "CSE", 4, ad1, "Aaradhya", 105, "double");

		if (h.validateStudentName()) {
			if (h.validateBranchName() && h.validateExamMarks()) {
				System.out.println("Student Id :" + h.getStudentId());
				System.out.println("Student Name :" + h.getStudentName());
				System.out.println("Qualifying Marks :" + h.getQualifyingExamMarks());
				System.out.println("Residential Status :" + h.getResidentialStatus());
				System.out.println("Current Year of Engineering :" + h.getYearOfEngg());
				System.out.println("Branch Name :" + h.getBranchName());
				System.out.println("Permanent Addressline :" + h.getPermanentAddress().getAddressLine());
				System.out.println("Permanent Address city :" + h.getPermanentAddress().getCity());
				System.out.println("Permanent Address state :" + h.getPermanentAddress().getState());
				System.out.println("Permanent Address state :" + h.getPermanentAddress().getZip());
				System.out.println("Hostel Name :" + h.getHostelName());
				System.out.println("Room Number :" + h.getRoomNumber());
				System.out.println("Room Type :" + h.getRoomType());
				System.out.println("***********************************");
			}
		}

		Address residentailad = new Address();
		residentailad.setAddressLine("123 Greenway Dr");
		residentailad.setCity("Irving");
		residentailad.setState("Texas");
		residentailad.setZip("75038");

		Address paddress = new Address();
		paddress.setAddressLine("501 Monroe St");
		paddress.setCity("Dallas");
		paddress.setState("Texas");
		paddress.setZip("75080");

		DayScholar ds = new DayScholar(14, "Timmy", 80.0f, 'D', "CSE", 4, paddress, residentailad, 10);
		if (ds.validateStudentName()) {
			if (ds.validateBranchName() && ds.validateExamMarks()) {
				System.out.println("Student Id :" + ds.getStudentId());
				System.out.println("Student Name :" + ds.getStudentName());
				System.out.println("Qualifying Marks :" + ds.getQualifyingExamMarks());
				System.out.println("Residential Status :" + ds.getResidentialStatus());
				System.out.println("Current Year of Engineering :" + ds.getYearOfEngg());
				System.out.println("Branch Name :" + ds.getBranchName());
				System.out.println("Residential Addressline :" + ds.getResidentialAddress().getAddressLine());
				System.out.println("Residential Address city :" + ds.getResidentialAddress().getCity());
				System.out.println("Residential Address state :" + ds.getResidentialAddress().getState());
				System.out.println("Residential Address state :" + ds.getResidentialAddress().getZip());
				System.out.println("Distance:" + ds.getDistance());
				System.out.println("Permanent Addressline :" + ds.getPermanentAddress().getAddressLine());
				System.out.println("Permanent Address city :" + ds.getPermanentAddress().getCity());
				System.out.println("Permanent Address state :" + ds.getPermanentAddress().getState());
				System.out.println("Permanent Address state :" + ds.getPermanentAddress().getZip());

			}
		}
	}

}
