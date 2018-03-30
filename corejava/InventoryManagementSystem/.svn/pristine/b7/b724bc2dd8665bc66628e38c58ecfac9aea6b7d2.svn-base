package com.crmindz.bcjMay2017.InventoryManagement.controller;

import java.util.Map;
import java.util.Scanner;

import com.crmindz.bcjMay2017.InventoryManagement.service.InventoryManagementService;


/**
 * @author Bootcamp User 005
 *
 */
public class Demo {
	private Scanner sc;
	InventoryManagementService ims = new InventoryManagementService();
	/**
	 * This method saves the string and parses it.
	 */
	public void saveInventory(){
		 sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String Input = sc.nextLine();
		ims.saveInventoryInfo(Input);
		
	}
	/**
	 * This method displays the details of the department.
	 */
	public void displayInventory(){
		Map<String,Integer> map2 = ims.displayInventoryInfo();
       for (Map.Entry<String, Integer> m : map2.entrySet()){
    	   System.out.println("***********");
    	   System.out.println("The inventory Details of "+m.getKey()+" are:");
           System.out.println(m.getKey()+"->"+m.getValue());
           System.out.println("***********");
			
			}
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the department to retrieve the inventory:");
		String a = sc1.nextLine();
			
			
				System.out.println(map2.containsValue(a));
			
			sc1.close();
			
		}
		
	

	public static void main(String[] args) {
		Demo d = new Demo();
		d.saveInventory();
		d.displayInventory();
		

	}

}
