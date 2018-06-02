package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call method asking for department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		switch(depChoice) {
			case 1: 
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acct";
			default:
				return "";
		}
		
	}
}
