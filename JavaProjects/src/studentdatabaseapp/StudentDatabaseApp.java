package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		Student[] students = new Student[in.nextInt()];
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("\n\nStudent "+ (i+1));
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
			
		}
		for(int i = 0; i < students.length; i++) {
			System.out.println("\n\nStudent "+ (i+1));
			System.out.println(students[i].toString());
		}
		in.close();
	}

}
