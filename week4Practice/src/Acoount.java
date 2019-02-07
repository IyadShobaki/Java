
public class Acoount {
	private String name;
	
	// No constructor (parameters
//	public void setName (String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
	
	// One parameter (name)
	
//	public Acoount(String name) {
//		this.name = name;
//	}
//	public void setName (String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
	
	//Two parameter
	private double balance;
	
	public Acoount(String name, double balance) {
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
