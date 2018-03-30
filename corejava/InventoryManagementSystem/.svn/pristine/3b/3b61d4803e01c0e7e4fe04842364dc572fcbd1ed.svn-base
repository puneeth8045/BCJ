package com.crmindz.bcjMay2017.InventoryManagement.service;

import java.util.Map;

import com.crmindz.bcjMay2017.InventoryManagement.DAO.InventoryManagementDAO;

/**
 * @author Bootcamp User 005
 *
 */
public class InventoryManagementService {
	InventoryManagementDAO imdao = new InventoryManagementDAO();
	/**
	 * @param Input
	 * 
	 * This method splits the string and parses it.
	 */
	public void saveInventoryInfo(String Input){
		String[] inventory = Input.split(",");
		for(String inv : inventory){
			String[] array = inv.split(":");       
		           String s1 = array[0];
		           String s2 = array[1];
		           int y = Integer.parseInt(s2);
		           imdao.saveInventory(s1, y);
		           
		       
		       
			}
		
		}
	/**
	 * @return
	 * 
	 * This method passes the map.
	 */
	public Map<String,Integer> displayInventoryInfo(){
		Map<String,Integer> map1 = imdao.displayInventory();
		return map1;
		
		
	}
	}


