/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 10
    4/1/2019
 */
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int stop =0 ;
		do {
			System.out.println("Please enter an integer or -999 to stop :");
			int number = input.nextInt();
			if (number == -999) {
				stop = number;
			}else {
				OddorEven(number);
			}
			
			
		}while (stop != -999);
	}
	
	public static void OddorEven(int number) {
		if (number % 2 == 0)
			System.out.println("This number is even.");
		else
			System.out.println("This number is odd.");
	}
}
