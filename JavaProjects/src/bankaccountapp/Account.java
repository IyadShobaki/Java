package bankaccountapp;

public abstract class Account implements IBaseRate {
  // abstract (will not be able to create objects from Account class
	
	// List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		//System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $"+ balance);
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
		
	}
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber =(int) (Math.random() * Math.pow(10,3));
				
			return lastTwoSSN + uniqueID + randomNumber;	
	}
	public void compound() {
		double accrudInterest = balance * (rate/100);
		balance = balance + accrudInterest;
		System.out.println("Accrud Interest: $" + accrudInterest);
		printBalance();
	}
	// List common methods - transactions
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance + 
				"\nRATE: " + rate + "%");
	}
}
