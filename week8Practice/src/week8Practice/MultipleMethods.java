package week8Practice;

import java.util.Scanner;

public class MultipleMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program computes the sum of two integers.");
		
		System.out.println("Please eneter a first number: ");
		
		int num1 = input.nextInt();
		System.out.println("Please eneter a second number: ");
		
		int num2 = input.nextInt();
		
		int result = AddTwo(num1, num2);
		System.out.printf("The sum of %d and %d is %d", num1, num2, result);
	}
	
	private static int AddTwo(int x, int y) {
		return x + y;
	}

}
