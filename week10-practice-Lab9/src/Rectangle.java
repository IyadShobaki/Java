/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 9
    3/24/2019
 */
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		
		int height;
		int width;
		int result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height of the rectangle:");
		height = input.nextInt();
		System.out.println("Enter the width of the rectangle:");
		width = input.nextInt();
		
		result = CalcAreaOfRectangle(height, width);
		
		System.out.printf("The area of the rectangle is %d\n", result);
	
	}
	
	public static int CalcAreaOfRectangle(int height, int width) {
		return height * width;
	}
	
}
