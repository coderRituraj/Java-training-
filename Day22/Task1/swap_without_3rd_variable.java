package Com.Bhavna.Task1;

import java.util.Scanner;

public class swap_without_3rd_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1,val2;
		System.out.println("*****Before swap the number******");
		System.out.println("Enter first number");
		val1=sc.nextInt();
		System.out.println("Enter second number");
		val2=sc.nextInt();
		// Swapping logic
		val1 = val1  + val2;
		val2 = val1 - val2;
		val1 = val1 - val2;
		
		System.out.println("************After swap***********");
		System.out.println("first number " +val1);
		System.out.println("Second number " +val2);
		
	}

}
