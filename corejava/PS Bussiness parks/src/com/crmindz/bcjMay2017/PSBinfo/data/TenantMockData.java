package com.crmindz.bcjMay2017.PSBinfo.data;

import java.util.HashMap;
import java.util.Map;

import com.crmindz.bcjMay2017.PSBinfo.model.TenantDetails;

/**
 * @author Bootcamp User 005
 *
 */
public class TenantMockData {
	public Map<String, TenantDetails> map = new HashMap<String, TenantDetails>();

	/**
	 * @param td
	 */
	public void createTenantInfo(TenantDetails td) {
		map.put(td.getTenantName(), td);

	}

	/**
	 * @return
	 */
	public Map<String, TenantDetails> getTenantDetails() {

		return map;

	}

}
