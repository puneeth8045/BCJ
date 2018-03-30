package com.crmindz.bcjMay2017.PSBinfo.DAO;

import java.util.Map;

import com.crmindz.bcjMay2017.PSBinfo.data.TenantMockData;
import com.crmindz.bcjMay2017.PSBinfo.model.TenantDetails;

/**
 * @author Bootcamp User 005
 *
 */
public class PSBDAO {
	TenantMockData tmd = new TenantMockData();

	/**
	 * @param td
	 */
	public void createTenant(TenantDetails td) {

		tmd.createTenantInfo(td);

	}

	/**
	 * @return
	 */
	public Map<String, TenantDetails> getTenantinfo() {

		Map<String, TenantDetails> map1 = tmd.getTenantDetails();
		return map1;

	}

}
