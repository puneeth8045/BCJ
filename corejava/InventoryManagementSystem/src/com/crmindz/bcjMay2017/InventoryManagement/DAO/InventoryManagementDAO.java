package com.crmindz.bcjMay2017.InventoryManagement.DAO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bootcamp User 005
 *
 */
public class InventoryManagementDAO {
	Map<String, Integer> map =new HashMap<String,Integer>();
	/**
	 * @param s1
	 * @param y
	 * 
	 * This method stores the data in the map.
	 */
	public void saveInventory(String s1,int y){
		
		map.put(s1, y);
		
	}
	
	/**
	 * @return
	 * 
	 * This method returns the map.
	 */
	public Map<String, Integer> displayInventory(){
		return map;
		
	}

}
