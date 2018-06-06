package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance;
	private static int courseCost = 600;
	private static int id = 1000;
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
		//in.close();
	}
	
	//generate an ID
	private void setStudentId() {
		id++;
		//Grade level + id
		this.studentId = gradeYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += courseCost;
			}else { break; }
		}while(true);
		System.out.println("ENROLLED IN:" + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
}
