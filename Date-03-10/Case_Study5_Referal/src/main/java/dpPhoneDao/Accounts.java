package dpPhoneDao;

import java.util.Scanner;

public class Accounts {
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String passWord;
	private String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

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
