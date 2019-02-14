import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println("Please enter a course name:");
		String theName = input.nextLine();
		
		myGradeBook.setCourseName(theName);
		
		System.out.println();
		
		myGradeBook.displayMessage();
		
		GradeBook myGradeBook1 = new GradeBook("ECA223 Java Programming");
		
		myGradeBook1.displayMessage();
	}

}
