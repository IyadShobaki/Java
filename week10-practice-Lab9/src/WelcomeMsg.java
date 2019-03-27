import java.util.Scanner;
public class WelcomeMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		name = input.nextLine();
		
		displayWelcomeMessage(name);
		
	}
	
	public static void displayWelcomeMessage(String username) {
		System.out.printf("Welcome %s!", username);
	}

}
