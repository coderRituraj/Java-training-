package Com.Bhavna.Task1;

import java.util.Scanner;

public class Pelindrome {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		 System.out.print("Enter the number ");
		 int Ispelindrome = n.nextInt();
		 int temp, sum=0;
		 temp = Ispelindrome;
		 int i=0;
		 
		for(;i<Ispelindrome;){
			 int remainder = Ispelindrome%10;
			 sum = (sum*10)+remainder;
			 Ispelindrome = Ispelindrome /10;
			 }
		 if(temp == sum)
			 System.out.println(sum +" Number is pelindrome");
		 else 
			 System.out.println(sum +" Number is not pelindrome");
			 

}
}