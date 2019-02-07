/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 3
    1/28/2019
 */
import java.util.Scanner;

public class OddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer\n");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d is even number", num );
		}else {
			System.out.printf("%d is odd number", num );
		}
	}

}
