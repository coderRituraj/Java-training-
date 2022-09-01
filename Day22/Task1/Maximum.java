package Com.Bhavna.Task1;
import java.util.*; 

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1,val2,val3;
		System.out.println("Enter First value");
		val1= sc.nextInt();
		System.out.println("Enter Second value");
		val2= sc.nextInt();
		System.out.println("Enter Third value");
		val3= sc.nextInt();
		
		if(val1 > val2 && val1 > val3)
		{
			System.out.println(val1+" is greater in this number");
		}
		else if(val2 > val1 && val1 > val3)
		{
			System.out.println(val2+ " is greater in among 3");
		
		}
		else 
			System.out.println(val3+ " is greater in among 3");
		
	}

}
