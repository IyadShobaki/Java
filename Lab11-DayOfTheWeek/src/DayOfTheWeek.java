/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 11
    4/8/2019
 */
import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
char ans;
		
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a day of the week:/n");
		String day = input.next().toUpperCase();
		dayOftheWeek(day);
		System.out.println("Please enter a day of the week as a number:/n");
		int dayNumber = input.nextInt();
		dayOfTheWeek(dayNumber);
		
		System.out.println("Would you like to try again? Y or N/n");
		ans = input.next().charAt(0);
		ans = Character.toUpperCase(ans);
		}while (ans == 'Y');
		System.out.println("Thank you!");
	}
	
	private static void dayOftheWeek(String day) {
	
		switch (day) {
		
		case "SUNDAY":
			System.out.println("Oh no, school tomorrow!");
			break;
		case "MONDAY":
			System.out.println("Mondays are a bummer");
			break;
		case "TUESDAY":
			System.out.println("At least it isn't Monday!");
			break;
			
		case "WEDNESDAY":
			System.out.println("Getting there");
			break;
			
		case "THURSDAY":
			System.out.println("Almost there");
			break;
			
		case "FRIDAY":
			System.out.println("TGIF");
			break;
		case "SATURDAY":
			System.out.println("Party!");
			break;
		default:
			System.out.println("Not a valid day of the week");
		}
	}

	
	private static void dayOfTheWeek(int day) {
	
	switch (day) {
		
		case 1:
			System.out.println("Oh no, school tomorrow!");
			break;
		case 2:
			System.out.println("Mondays are a bummer");
			break;
			
		case 3:
			System.out.println("At least it isn't Monday!");
			break;
			
		case 4:
			System.out.println("Getting there");
			break;
			
		case 5:
			System.out.println("Almost there");
			break;
			
		case 6:
			System.out.println("TGIF");
			break;
			
		case 7:
			System.out.println("Party!");
			break;
		default:
			System.out.println("Not a valid day of the week");
		}
	

	}

}
