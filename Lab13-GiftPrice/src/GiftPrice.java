/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 13
    4/22/2019
 */
import java.util.Scanner;
public class GiftPrice {

	public static void main(String[] args) {
		double[] prices = new double[5];
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int counter = 0; counter < prices.length; counter++) {
			System.out.print("Enter a gift price: ");
			prices[counter] = input.nextDouble();
			
		}
		System.out.printf("%nSales tax on gift items:%n");
		printSalesTax(prices);
	}
	
	public static void printSalesTax(double[] array) {
		double salesTax = 0.05;
		double total;
		for (double number : array) {
			total = number * salesTax;
			System.out.printf("$%.2f%n", total);
		}
	}
}
