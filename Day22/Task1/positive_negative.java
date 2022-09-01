package Com.Bhavna.Task1;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val;
	    System.out.println("Enter any number");
		val=sc.nextInt();
		if(val<0)
		{
			 System.out.println("Enter value is negative");
		}
		else if(val==0)
		{
			 System.out.println("Enter value is zero");
		}
		else 
			System.out.println("Enter value is posetive");
	}

}
