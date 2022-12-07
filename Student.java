package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private String studentID;
	private int tuitionBalance = 0;
	// static: belongs to class, and not an instance of object
	private static int costOfCourse = 600;
	// Every time we create a student, we want to increment value of student by 1
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student year: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
				
	}
	
	// Generate a unique ID
	private void setStudentID() {
		// Grade + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside loop, user hits 0 when done enrolling
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);		
	}
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
	
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance -= payment;
		
		System.out.println("Thank you for your payment of $" + payment);
		
		// helper function	
		viewBalance();
	}
	
//	public String showInfo() {
//		return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + courses + "\nBalance: " + tuitionBalance;
//	}

	// Show status
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nYear: " + gradeYear + "\nCourses: "
				+ courses + "\nStudent ID: " + studentID + "\nBalance: " + tuitionBalance;
	}
	
}
