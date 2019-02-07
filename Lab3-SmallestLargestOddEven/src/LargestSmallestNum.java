/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 3
    1/28/2019
 */
import java.util.Scanner;

public class LargestSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer\n");
		int num1 = input.nextInt();
		
		System.out.print("Enter second integer\n");
		int num2 = input.nextInt();
		
		System.out.print("Enter third integer\n");
		int num3 = input.nextInt();
		
		System.out.print("Enter fourth integer\n");
		int num4 = input.nextInt();
		
		System.out.print("Enter fifth integer\n");
		int num5 = input.nextInt();
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.printf("The largest number is %d%n", num1);
		}
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.printf("The smallest number is %d%n", num1);
		}
		
		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.printf("The largest number is %d%n", num2);
		}
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.printf("The smallest number is %d%n", num2);
		}
		
		if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.printf("The largest number is %d%n", num3);
		}
		if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.printf("The smallest number is %d%n", num3);
		}
		
		if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.printf("The largest number is %d%n", num4);
		}
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			System.out.printf("The smallest number is %d%n", num4);
		}
		
		if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.printf("The largest number is %d%n", num5);
		}
		if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
			System.out.printf("The smallest number is %d%n", num5);
		}
	}

}
