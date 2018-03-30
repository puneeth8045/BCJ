package com.crmindz.bcjMay2017.PsbBuildingInfo.service;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.crmindz.bcjMay2017.PsbBuildingInfo.DAO.PSBDAO;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.BuildingDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.TenantDetails;


public class PSBService {
	
PSBDAO psbdao = new PSBDAO();
	
	public void createTenant(BuildingDetails bd) {

		psbdao.createTenant(bd);
	}

	/**
	 * @param addressLine1
	 * @return
	 */
	public ArrayList<TenantDetails> displayTenantInfo(String buildingName) {
		Map<String, ArrayList<TenantDetails>> map2 = psbdao.getTenantinfo();
		ArrayList<TenantDetails> list = new ArrayList<>();
        TenantDetails td = new TenantDetails();
		for (Map.Entry<String, ArrayList<TenantDetails>> m : map2.entrySet()) {
			
			if (buildingName.equals(m.getKey())) {
				list = m.getValue();
				
				}
			}
		return list;

	}

}
