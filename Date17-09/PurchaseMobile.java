package com.bhavna.assessment_modification;

import java.util.Scanner;

public class PurchaseMobile {
	String mobileNumber;
	String name;
	String referralCode;
	String choice;

	public void purchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name ");
		// name=sc.next();
		name = "Amit";
		System.out.println("Enter your mobile number");
		// mobileNumber= sc.next();
		mobileNumber = "9999104696";

		System.out.println("Do you have referral code \nYes/NO:");
		// String ch = sc.next();
		choice = "yes";

		if (choice.equalsIgnoreCase("Yes")&& name.equals("Amit")) {
			System.out.println("Enter your referral code");
			// referralCode = sc.next();
			referralCode = "ffggb";
			if (referralCode.equals(Referral.referrel)) {
				Referral.incrementPnts();
				System.out.println("You will also win 200 points");
			}
		} else {
			System.out.println("Enjoy the shoping");
		}
	}

}
