package com.crmindz.bcjMay2017.DAO.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.crmindz.bcjMay2017.JDBC.util;
import com.crmindz.bcjMay2017.Model.ProductDetails;


public class ProductCatalogDAO {
	public static ArrayList<Integer> getProductCost(ProductDetails pd,ArrayList<String> arr){
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		try{
			Connection con = util.getConnection();
			for(String element : arr){
			PreparedStatement ps3 = con.prepareStatement("select cost from ProductDetails where item=?");
			ps3.setString(1,element);
			ResultSet rset2 = ps3.executeQuery();
         	while(rset2.next()){
				pd.setCost(rset2.getInt("cost"));
         	}
			arr1.add(pd.getCost());
		}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return arr1;
	}

}
