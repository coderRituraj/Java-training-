package Com.Bhavna.Task1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		 Scanner n = new Scanner(System.in);
		 System.out.print("Enter the number ");
		 int IsPrime = n.nextInt();
		 
		 
		 boolean flag = false;
		 for(int i=2;i<=IsPrime/2;++i)
		 {
			 if(IsPrime % i ==0)
			 {
				 flag = true;
				 break;
						
			 }
		 }
		 if(!flag)
			 System.out.println(IsPrime+ " is a prime number");
		 else 
			 System.out.println(IsPrime+ " is not prime ");
	}

}
