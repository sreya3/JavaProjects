package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "mycompany.com";
	
	
	//Constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		//Call method asking for department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call method to generate random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password: " + this.password);
	
		//generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Email address: " + email);
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
	
	//generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890$#@%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
}
