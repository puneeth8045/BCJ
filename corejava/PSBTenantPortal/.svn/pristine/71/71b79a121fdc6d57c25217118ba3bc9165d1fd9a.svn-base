package com.crmindz.bcjMay2017.PsbBuildingInfo.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.crmindz.bcjMay2017.PsbBuildingInfo.model.Address;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.BuildingDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.ContactDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.TenantDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.service.PSBService;

public class PSBParkInfo {
	PSBService psbservice = new PSBService();
	private Scanner sc;

	public static void main(String[] args) {
		PSBParkInfo psbinfo = new PSBParkInfo();
		psbinfo.mockTenantData();
		psbinfo.displayTenant();

	}

	public void mockTenantData() {
		BuildingDetails bd = new BuildingDetails();
		sc = new Scanner(System.in);
		String Y = "y";
		String N = "n";

		for (int i1 = 1; i1 <= 100; i1++) {
			ArrayList<TenantDetails> arraylist = new ArrayList<>();
			System.out.println("y/n");
			String s1 = sc.nextLine();
			if (Y.equals(s1)) {
				System.out.println("Enter the Building name: ");
				String BuildingName = sc.nextLine();
				bd.setBuildingName(BuildingName);
				for (int i = 1; i <= 1000; i++) {
					System.out.println("y/n");
					String s = sc.nextLine();
					if (Y.equals(s)) {
						TenantDetails td = new TenantDetails();
						Address a = new Address();

						ContactDetails cd = new ContactDetails();
						ContactDetails cd1 = new ContactDetails();
						ArrayList<ContactDetails> al = new ArrayList<>();

						System.out.println(i + ". " + "Enter the tenant name:");
						String tenantName = sc.nextLine();
						td.setTenantName(tenantName);

						System.out.println("Enter the addressLine1:");
						String addressLine1 = sc.nextLine();
						a.setAddressline1(addressLine1);

						System.out.println("Enter the addressLine2:");
						String addressLine2 = sc.nextLine();
						a.setAddressline2(addressLine2);

						System.out.println("Enter the city:");
						String city = sc.nextLine();
						a.setCity(city);

						System.out.println("Enter the state:");
						String state = sc.nextLine();
						a.setState(state);

						System.out.println("Enter the Zipcode:");
						String zipCode = sc.nextLine();
						a.setZipcode(zipCode);

						System.out.println("Enter the Primary Contact Details :" + "\n Enter the Contact name: ");
						String contactname = sc.nextLine();
						cd.setContactName(contactname);

						System.out.println("Enter the phone number:");
						String phoneNo = sc.nextLine();
						cd.setPhoneNo(phoneNo);

						System.out.println("Enter the email: ");
						String email = sc.nextLine();
						cd.setEmail(email);

						System.out.println("Enter the Secondary Contact Details :" + "\n Enter the Contact name: ");
						String contactname1 = sc.nextLine();
						cd1.setContactName(contactname1);

						System.out.println("Enter the phone number:");
						String phoneNo1 = sc.nextLine();
						cd1.setPhoneNo(phoneNo1);

						System.out.println("Enter the email: ");
						String email1 = sc.nextLine();
						cd1.setEmail(email1);

						System.out.println("\n***********************************************************************");
						al.add(cd);
						al.add(cd1);
						td.setAddress(a);
						td.setContactDetails(al);
						
						arraylist.add(td);
						
						
					} else if (N.equals(s)) {

						break;
					}

				}
				bd.setTenantlist(arraylist);
				psbservice.createTenant(bd);
				
			} else if (N.equals(s1)) {
				break;
			}
		}

	}

	public void displayTenant() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the building name:");
		String BuildingName = sc1.nextLine();
		psbservice.displayTenantInfo(BuildingName);
		sc1.close();
		ArrayList<TenantDetails> al2 = psbservice.displayTenantInfo(BuildingName);
		for (TenantDetails td : al2) {
			System.out.println("Company name:" + td.getTenantName());
			System.out.println("Tenant Addressline1:" + td.getAddress().getAddressline1());
			System.out.println("Tenant Addressline2" + td.getAddress().getAddressline2());
			System.out.println("City" + td.getAddress().getCity());
			System.out.println("State" + td.getAddress().getState());
			System.out.println("zipcode" + td.getAddress().getZipcode());
			System.out.println("Primary Contact name:" + td.getContactDetails().get(0).getContactName());
			System.out.println("Phone number:" + td.getContactDetails().get(0).getPhoneNo());
			System.out.println("email:" + td.getContactDetails().get(0).getEmail());
			System.out.println("Secondary Contact name:" + td.getContactDetails().get(1).getContactName());
			System.out.println("Phone number:" + td.getContactDetails().get(1).getPhoneNo());
			System.out.println("email:" + td.getContactDetails().get(1).getEmail());
			System.out.println("###############################################");
		}
	}
}
