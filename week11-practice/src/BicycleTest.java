
public class BicycleTest {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle(10,15,12);
		
		System.out.println("The speed of bike " + bike1.getID() + " is " + bike1.getSpeed());
		
		Bicycle bike2 = new Bicycle(20, 30, 8);
		
		System.out.println("The speed of bike " + bike2.getID() + " is " + bike2.getSpeed());
		
		System.out.printf("The number of bicycles: %d%n", Bicycle.getNumberOfBicycles());
		
		bike1.applyBrake(5);
		
		System.out.println("The speed of bike " + bike1.getID() + " is " + bike1.getSpeed());

	}

}
