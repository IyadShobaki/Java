package week8Practice;
import java.util.Scanner;
public class AddEvens {

	public static void main(String[] args) {
		int sum = 0;
		int start;
		int end;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to start: ");
		start = input.nextInt();
		while (start % 2 != 0) {
			System.out.println("Please enter an even number for first number");
			start = input.nextInt();
		}
		System.out.println("Enter a number to end: ");
		end = input.nextInt();
		while (end % 2 != 0) {
			System.out.println("Please enter an even number for second number");
			end = input.nextInt();
		}
		for (int counter = start; counter <= end; counter +=2)
		{
			sum += counter;
		}
		System.out.println("The sum from " + start + " to " + end + " (evens) is " + sum);
	}

}
