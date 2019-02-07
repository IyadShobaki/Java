import java.util.Scanner;
public class AcountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		Acoount myAccount = new Acoount(); // without constructor
//		System.out.println("Please enter the name:");
//		String theName = input.nextLine();
//		myAccount.setName(theName);
//		System.out.println();
//		
//		System.out.printf("Initial name is %s%n%n", myAccount.getName());
		
		// the following is just one parameter(name)
//		Acoount account1 =new Acoount("Jane Green"); 
//		Acoount account2 = new Acoount("Jhon Blue");
//		
//		System.out.printf("Account1 name is: %s%n",  account1.getName());
//		System.out.printf("Account2 name is: %s%n", account2.getName());
		
		// the following with two parameters
		
		Acoount account1 =new Acoount("Jane Green", 50.00); 
		Acoount account2 = new Acoount("Jhon Blue", -7.53);
		
		System.out.printf("Account1 name is: %s%n and her balance is: $%.2f%n",  account1.getName(), account1.getBalance());
		
		System.out.printf("Account2 name is: %s%n and his balance is: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.println("Enter deposit amount for account1:");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.println("Enter deposit amount for account2:");
		double depositAmount1 = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount1);
		account2.deposit(depositAmount1);
		
		
		System.out.printf("Account1 name is: %s%n and her balance is: $%.2f%n",  account1.getName(), account1.getBalance());
		
		System.out.printf("Account2 name is: %s%n and his balance is: $%.2f%n", account2.getName(), account2.getBalance());
		
		
	}
	
	
}
