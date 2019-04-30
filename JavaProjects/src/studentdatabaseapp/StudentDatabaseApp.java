package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	
//		Student stu1 = new Student();
//		stu1.enroll();
//		stu1.payTuition();
//		System.out.println(stu1.toString());
		
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents =in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new student
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n] .enroll();
			students[n] .payTuition();
			System.out.println(students[n] .toString());
		}
		for (int n = 0; n < numOfStudents; n++) {
			
			System.out.println(students[n] .toString());
		}
	}

}
