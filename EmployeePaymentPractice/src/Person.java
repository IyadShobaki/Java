
public class Person {

	private String firstName;
	private String lastName;
	private double hourlyRate;
	public Person() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.hourlyRate = 10;
	}
	public Person(String firstName, String lastName, double hourlyRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", hourlyRate=" + hourlyRate + "]";
	}
	
	public double getPayment(int hours) {
		
		return this.hourlyRate*hours;
	}
	
}

