import java.util.Scanner;
public class DeveloperMaterial {

	public static void main(String[] args) {
		boolean logical;
		boolean patient;
		boolean overachiever;
		int age;
		int optimalAge  = 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("true or false - You are logical: ");
		logical = input.nextBoolean();
		
		System.out.print("true or false - You are patient: ");
		patient = input.nextBoolean();
		
		System.out.print("true - false - You are an overachiever: ");
		overachiever = input.nextBoolean();
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		if (logical && patient && (age >= optimalAge || overachiever)) 
			System.out.println("You are a perfect candidate to program!");
		else if (!patient)
			System.out.println("Didn't you know that patience is a virtue");
		else if(!logical)
			System.out.println("Who told you that weren't logical - they lied!");
		else if (!overachiever)
			System.out.println("Come back in " + (optimalAge - age) + " years");
				
		

	}

}
