package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Jhon", "Smith");
		
//		em1.setAlternateEmail("js@email.com");
//		System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
		

	}

}
