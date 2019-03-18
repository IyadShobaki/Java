/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 6
    2/19/2019
 */
import java.util.Scanner;
import java.lang.*;
public class Conversions {

	public static void main(String[] args) {
		double number;
		String type;
		boolean isTrue = true;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What number would you like to convert?");
			 number = input.nextDouble();
				while (number < 0 ) {
					System.out.println("Please enetr a number greater than zero:");
					number = input.nextDouble();
				}
			
			System.out.print("What type of conversion would you like to do?\nGL = Gallon to Liter\n"
					+ "IC = Inch to Centimeter\r\nPK = Pound to Kilogram\nMK = Mile to Kilometer\n");
			type = input.next().toUpperCase();
			
			if (type.equals("GL")) {
				double liter = number * 3.78541178 ;
				System.out.printf("There is %.2f liter/s in %.2f gallon/s%n", liter, number);
				isTrue = false;
			}else if(type.equals("IC")) {
				double centimeter = number * 2.5;
				System.out.printf("There is %.2f centimeter/s in %.2f inch/s%n", centimeter, number);
				isTrue = false;
			}else if(type.equals("PK")) {
				double kilogram = number * 0.45359237;
				System.out.printf("There is %.2f kilogram/s in %.2f pound/s%n", kilogram, number);
				isTrue = false;
			}else if (type.equals("MK")) {
				double kilometer = number * 1.609344;
				System.out.printf("There is %.2f kilometer/s in %.2f mile/s%n", kilometer, number);
				isTrue = false;
			}else {
				System.out.println("Invalid input!");
				
			}
			System.out.println("Would you like to convert different number? Y or N");
			char ans = input.next().charAt(0);
			ans = Character.toUpperCase(ans);
			if (ans == 'Y' ) {
				isTrue = true;
			}else {
				System.out.print("Thank you!");
			}
		}while(isTrue);
	
		
	}

	
}


