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
		int largestNumber = 0;
		int smallestNumber = 0;
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
		
		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
			largestNumber = num1;
		}
		if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {
			smallestNumber = num1;
		}
		
		if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
			largestNumber = num2;
		}
		if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {
			smallestNumber = num2;
		}
		
		if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
			largestNumber = num3;
		}
		if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5) {
			smallestNumber = num3;
		}
		
		if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
			largestNumber = num4;
		}
		if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5) {
			smallestNumber = num4;
		}
		
		if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4) {
			largestNumber = num5;
		}
		if (num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 <= num4) {
			smallestNumber = num5;
		}
		
		
		System.out.printf("The largest number is: %d%n", largestNumber);
		System.out.printf("The smallest number is: %d", smallestNumber);
	}

}


/*
 Excellent job Iyad,
  you have received 19.85/20 pts on Lab 3.
  The only suggestion I have is to handle the case where the user enters in duplicate numbers for part 1.  
  For example, if the user types in all 1's for their input, 
  they will not see a message for biggest or smallest.  
  There are a few ways to handle this.  
  One is to change all the < operators to <= and all the > operators to >=.  
  This would avoid the problem but would introduce a new one because then you would get
   multiple "biggest" or "smallest" messages.  To avoid this instead of outputting the message right away,
   you could create a few variables int largest and int smallest at the beginning of the program and then
  set these variables appropriately.  In this way, you would only have two print statements at the end of
    the program that output the largest and the smallest values respectively.  If you have any questions,
    please let me know.
       
       
       
       old solution:
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

}﻿﻿
 */
