package com.crmindz.bcjMay2017.PsbBuildingInfo.data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.crmindz.bcjMay2017.PsbBuildingInfo.model.BuildingDetails;
import com.crmindz.bcjMay2017.PsbBuildingInfo.model.TenantDetails;

public class TenantMockData {
	public Map<String, ArrayList<TenantDetails>> map = new HashMap<String,ArrayList<TenantDetails>>();
	ArrayList<TenantDetails> al1 = new ArrayList<TenantDetails>();
	public void createTenantInfo(BuildingDetails bd) {
		
		map.put(bd.getBuildingName(), bd.getTenantlist());

	}

	/**
	 * @return
	 */
	public Map<String,ArrayList<TenantDetails> > getTenantDetails() {

		return map;

	}

}
