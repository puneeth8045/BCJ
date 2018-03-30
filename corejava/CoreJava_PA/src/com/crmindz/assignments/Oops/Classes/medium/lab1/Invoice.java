package com.crmindz.assignments.Oops.Classes.medium.lab1;

/**
 * @author Puneeth Invoice entity class for a hardware store
 */
public class Invoice {
	static String partNumber;
	static String partDescription;
	static int quantity;
	static double itemPrice;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Invoice(String partNumber, String partDescription, int quantity, double itemPrice) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	/**
	 * Method to calculate the invoice amount
	 */
	public void getInvoiceAmount() {
		if (quantity > 0 && itemPrice > 0) {
			double invoiceAmount = quantity * itemPrice;
			System.out.println("The invoice amount is: " + invoiceAmount);
		} else {
			quantity = 0;
			itemPrice = 0.0;
		}
	}

}
