
public class Person {
private String firstName;
private String lastName;
private int age;

public Person(String initFirstName, String initLastName, int initAge) {
	firstName = initFirstName;
	lastName = initLastName;
	age = initAge;
}
public void setFirstName(String fname) {
	firstName = fname;
	
}
public String getFirstName() {
	return firstName;
}
public void setLastName(String lname) {
	lastName = lname;
	
}
public String setLastName() {
	return lastName;
}
public void setAge(int initAge) {
	age = initAge;
	
}
public int getAge() {
	return age;
}
public void identifyYourself() {
	System.out.println("My name is "+ firstName + " " + lastName + " and my age is "+ age);
}
}
