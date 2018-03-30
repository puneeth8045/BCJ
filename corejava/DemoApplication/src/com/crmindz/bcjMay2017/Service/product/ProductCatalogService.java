package com.crmindz.bcjMay2017.Service.product;

import java.util.ArrayList;

import com.crmindz.bcjMay2017.DAO.Products.ProductCatalogDAO;
import com.crmindz.bcjMay2017.Model.ProductDetails;

public class ProductCatalogService {
	public static ProductDetails getTotalCost(ProductDetails pd , ArrayList<String> arr){
		ArrayList<Integer> arr1 = ProductCatalogDAO.getProductCost(pd, arr);
		int cost1 = arr1.get(0);
		System.out.println(cost1);
		int cost2 = arr1.get(1);
		int cost3 = arr1.get(2);
		
		int totalcost = ((pd.getProduct1Quantity()*cost1)+(pd.getProduct2Quantity()*cost2)+(pd.getProduct3Quantity()*cost3));
			System.out.println(totalcost);
		pd.setCost(totalcost);
		return pd;
		
	}

}
