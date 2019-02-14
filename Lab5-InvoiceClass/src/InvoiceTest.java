/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 5
    2/12/2019
 */
import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice myInvoice = new Invoice("3120089022", "Laptop",3, 1500.00);
		System.out.printf("Part number: %s%n", myInvoice.getPartNumber());
		System.out.printf("Part Description %s%n", myInvoice.getPartDescription());
		System.out.printf("The quantity purchased is %d%nThe price per item is %.2f%nThe amount of your bill is $%.2f%n%n",
						   myInvoice.getQuantityPurchased(),myInvoice.getItemPrice(), myInvoice.getInvoiceAmount());
		
		Invoice inv = new Invoice("3334400099", "Ipad", -2, 300.00);
		System.out.printf("Part number: %s%n", inv.getPartNumber());
		System.out.printf("Part Description %s%n", inv.getPartDescription());
		System.out.printf("The quantity purchased is %d%nThe price per item is %.2f%nThe amount of your bill is $%.2f%n%n",
				inv.getQuantityPurchased(),inv.getItemPrice(), inv.getInvoiceAmount());
		
		Invoice invo = new Invoice("3200456399", "Ipod", 2, 200.00);
		invo.setItemPrice(-20.00);
		System.out.printf("Part number: %s%n", invo.getPartNumber());
		System.out.printf("Part Description %s%n", invo.getPartDescription());
		System.out.printf("The quantity purchased is %d%nThe price per item is %.2f%nThe amount of your bill is $%.2f%n%n",
				invo.getQuantityPurchased(),invo.getItemPrice(), invo.getInvoiceAmount());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter part number:\n");
		String partNumber = input.next();
		
		System.out.print("Enter part description:\n");
		String partDescription = input.next();
		
		System.out.print("Enter Quantity:\n");
		int quantity = input.nextInt();
		
		System.out.print("Enter price per item:\n");
		double itemPrice = input.nextDouble();
		
		Invoice customerInvoice = new Invoice(partNumber, partDescription, quantity,itemPrice);
		System.out.printf("Part number: %s%n", customerInvoice.getPartNumber());
		System.out.printf("Part Description %s%n", customerInvoice.getPartDescription());
		System.out.printf("The quantity purchased is %d%nThe price per item is %.2f%nThe amount of your bill is $%.2f%n%n",
				customerInvoice.getQuantityPurchased(),customerInvoice.getItemPrice(), customerInvoice.getInvoiceAmount());
	
		
	}

}
