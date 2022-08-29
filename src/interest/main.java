package interest;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double amnt=sc.nextDouble();
		System.out.print("Enter type of interest(Simple Interest /Compound Interest): ");
		String type=sc.next(); 
		System.out.print("Enter the rate of interest that you want : ");
		double roi=sc.nextDouble();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		System.out.print("Enter your gender(M/F): ");
		String gendr=sc.next();
		System.out.print("Enter the duration in the year : ");
		double duration=sc.nextDouble();
		sc.close();
		System.out.println();
		//double int_accrd=0;
		Interest obj=new Interest();
		roi=obj.effROI(age,gendr,duration,roi);
		System.out.println("Year\tInterest\tAccrued Interest\tBalance");
		System.out.println(0+"\t-\t\t-\t\t\t"+amnt);
		if(type.equals("Simple")) {
			obj.printSimpInt(amnt,roi,duration);
		}
		else if(type.equals("Compound")) {
			obj.printCompInt(amnt,roi,duration);
		}
		
		
		
	}

	}


