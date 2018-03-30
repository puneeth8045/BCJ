package com.crmindz.bcjMay2017.PSBinfo.service;

import java.util.ArrayList;
import java.util.Map;

import com.crmindz.bcjMay2017.PSBinfo.DAO.PSBDAO;
import com.crmindz.bcjMay2017.PSBinfo.model.TenantDetails;

/**
 * @author Bootcamp User 005
 *
 */
public class PSBService {
	PSBDAO psbdao = new PSBDAO();

	/**
	 * @param td
	 */
	public void createTenant(TenantDetails td) {

		psbdao.createTenant(td);
	}

	/**
	 * @param addressLine1
	 * @return
	 */
	public ArrayList<TenantDetails> displayTenantInfo(String addressLine1) {
		Map<String, TenantDetails> map2 = psbdao.getTenantinfo();
		ArrayList<TenantDetails> list = new ArrayList<>();

		for (Map.Entry<String, TenantDetails> m : map2.entrySet()) {
			TenantDetails td = m.getValue();
			if (addressLine1.equals(td.getAddress().getAddressline1())) {
				list.add(td);

			}
		}
		return list;

	}

}