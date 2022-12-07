package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.enroll();
		s1.payTuition();
		System.out.println(s1.toString());
		
		
		
		// Ask how many users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new students
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
	}

}
