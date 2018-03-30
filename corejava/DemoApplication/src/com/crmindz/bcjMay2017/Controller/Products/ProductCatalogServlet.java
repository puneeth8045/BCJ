package com.crmindz.bcjMay2017.Controller.Products;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjMay2017.Model.ProductDetails;
import com.crmindz.bcjMay2017.Service.product.ProductCatalogService;


/**
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/ProductCatalogServlet")
public class ProductCatalogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCatalogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDetails pd = new ProductDetails();
		System.out.println("working");
		String product1 = request.getParameter("productone");
		String product2 = request.getParameter("producttwo");
		String product3 = request.getParameter("productthree");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add(product1);
		arr.add(product2);
		arr.add(product3);
		
		String productQuantity1 = request.getParameter("itemone");
		String productQuantity2 = request.getParameter("itemtwo");
		String productQuantity3 = request.getParameter("itemthree");
		
		
		int p1 = Integer.parseInt(productQuantity1);
		int p2 = Integer.parseInt(productQuantity2);
		int p3 = Integer.parseInt(productQuantity3);
		
		pd.setProduct1Quantity(p1);
		pd.setProduct2Quantity(p2);
		pd.setProduct3Quantity(p3);
		pd.setProduct1(product1);
		pd.setProduct2(product2);
		pd.setProduct3(product3);
		
		ProductDetails pd1 = ProductCatalogService.getTotalCost(pd, arr);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
			out.print("Successfull");	
		
		
	}

}
