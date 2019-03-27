import java.util.Scanner;
public class MethodCallsDeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers separated by a space");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		PerformAnalysis(num1, num2);
	}
	
	private static void PerformAnalysis(int num1, int num2) {
		System.out.printf("The sum of %d and %d is %d\n", num1, num2, CalcSum(num1, num2));
		
		System.out.printf("The product of %d and %d is %d\n", num1, num2, CalcProduct(num1, num2));
	}
	
	private static int CalcSum(int x, int y) {
		return x + y;
	}
	private static int CalcProduct(int x, int y) {
		return x * y;
	}

}
