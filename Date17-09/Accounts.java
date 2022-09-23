package com.bhavna.assessment_modification;

import java.util.Scanner;

public class Accounts {
	
	String firstName;
	String lastName;
	String userName;
	String emailId;
	String passWord;
	String phoneNumber;
	

	public void register() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\t------Registration Area---------");
			System.out.print(" Enter firstName => ");
			String firstName = sc.nextLine();
			this.firstName = firstName;

			System.out.print(" Enter lastName => ");
			String lastName = sc.nextLine();
			this.lastName = lastName;

			System.out.print(" Enter userName => ");
			String userName = sc.nextLine();
			this.userName = userName;

			System.out.print(" Enter password => ");
			String password = sc.nextLine();
			this.passWord = password;

			System.out.print(" Enter emailId => ");
			String emailId = sc.nextLine();
			this.emailId = emailId;

			System.out.print(" Enter phoneNo => ");
			String phoneNo = sc.nextLine();
			this.phoneNumber = phoneNo;
			System.out.println("\t\t--------Regidtration Successfull----------");
			System.out.println("\n\n");

		}
	}

	public void login() {
		System.out.println("----------Login Page---------");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print(" Enter user name => ");
			String username = scanner.nextLine();

			System.out.print(" Enter password => ");
			String password = scanner.nextLine();

			if ("Rituraj".equals(username) && "rajsingh".equals(password)) {
				System.out.println(" \t\tUser successfully logged-in.. ");
			} else {
				System.out.println(" \t\t In valid userName of password ");
			}
		}
	}

}
