
public class Payment {

	public static void main(String[] args) {
		
		// create a person object
		Person person = new Person();
		person.setFirstName("Victor");
		person.setLastName("Smith");
		person.setHourlyRate(10);
		
		// print the state of the person object
		System.out.println(person.toString());
		
		// get and print the weekly payment 
		System.out.println(person.getPayment(40));
		
	}

}
