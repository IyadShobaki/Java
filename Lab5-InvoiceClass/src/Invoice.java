/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 5
    2/12/2019
 */
public class Invoice {
private String partNumber;
private String partDescription;
private int quantityPurchased = 0;
private double itemPrice = 0.0;


public void setPartNumber(String initPartNumber)
{
	partNumber = initPartNumber;
}

public String getPartNumber()
{
	return partNumber;
}
public void setPartDescription(String initPartDescription)
{
	partDescription = initPartDescription;
}

public String getPartDescription()
{
	return partDescription;
}
public void setQuantityPurchased(int initQuantityPurchased)
{		
	if (initQuantityPurchased > 0) {
	quantityPurchased = initQuantityPurchased ;
}else {
	quantityPurchased = 0 ;
}
		
}

public int getQuantityPurchased()
{
	return quantityPurchased;
}
public void setItemPrice(double initItemPrice)
{	
	if (initItemPrice > 0.0) {
	itemPrice = initItemPrice ;
}else {
	itemPrice = 0.0 ;
}

		
}

public double getItemPrice()
{
	return itemPrice;
}
public Invoice(String partNumber, String partDescription, int quantityPurchased, double itemPrice) {
	this.partNumber = partNumber;
	this.partDescription = partDescription;
	
	if (quantityPurchased > 0) {
		this.quantityPurchased = quantityPurchased;
	}
	
	if (itemPrice > 0.0) {
		this.itemPrice = itemPrice;
	}
}

public double getInvoiceAmount()
{	double invoiceAmount;

	invoiceAmount = getQuantityPurchased() * getItemPrice();
	return invoiceAmount;
}

}
