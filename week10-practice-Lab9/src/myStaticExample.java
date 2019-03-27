import java.util.Scanner;
public class myStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers separated by a space: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		
		int result = MathUtility.add(num1, num2);
		
		
		System.out.println(num1 + " + " + num2 + " is : " + result);
	}
	
	

}
