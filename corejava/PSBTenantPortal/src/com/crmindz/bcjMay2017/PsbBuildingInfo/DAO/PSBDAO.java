package com.crmindz.bcjMay2017.PsbBuildingInfo.DAO;

import java.util.ArrayList;
import java.util.Map;

import com.crmindz.bcjMay2017.PsbBuildingInfo.data.TenantMockData;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.BuildingDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.TenantDetails;

public class PSBDAO {
	TenantMockData tmd = new TenantMockData();
	public void createTenant(BuildingDetails bd) {
     tmd.createTenantInfo(bd);
		
	}
	public Map<String, ArrayList<TenantDetails>> getTenantinfo() {

		Map<String, ArrayList<TenantDetails>> map1 = tmd.getTenantDetails();
		return map1;

	}

}
