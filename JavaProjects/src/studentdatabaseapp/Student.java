package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1- Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

		
	}
	// Generate an ID
	
	private void setStudentID()
	{
		// Grade level + ID
		id++;
		this.studentID =  gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll()
	{
		int n= 1;
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {   //this coding (course != "Q") doesn't work well.
			courses = courses + "\n   "+ n + "-" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		} else {break; }
		n++;
	}while(1 != 0);
		//System.out.println("ENROLLED IN: " + courses);

	}
	//View balance 
	public void viewBalance()
	{
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	// Pay tuition
	public void payTuition()
	{
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	// Show status
	public String toString()
	{
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
