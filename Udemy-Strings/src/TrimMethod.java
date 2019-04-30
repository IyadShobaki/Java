//String, StringBuffer, StringBuilder  11 + 12

//The important of methods of string class
import java.util.*;
public class TrimMethod {

	public static void main(String[] args) {
		
		// trim() method remove space in the beginning and in the end only,
		// but not from the middle
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Your City Name: ");
		String name = sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad"))
		{
			System.out.println("Hell Hyderabadi, Aadaab...");
		}
		else if (name.equals("chennai"))
		{
			System.out.println("Hello Madrasi, Vanakkam...");
		}
		else if (name.equals("bangalore"))
		{
			System.out.println("Hello Kannadiga, Namaskara...");
		}
		else
		{
			System.out.println("Please enter valid city name");
		}
		

	}

}
