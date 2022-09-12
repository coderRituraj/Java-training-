package Com.bhavna.task2;
import java.util.*;

public class CompanyDetailMain {

	public static void main(String[] args) {
		CompanyDetail obj[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose length company that you want you want their result ");
		int size =sc.nextInt();
	    obj = new CompanyDetail[size];
	   System.out.println("Enter the following deatili of compnay:-\nCompany Id\nCompany Name\nCity\nTurnover \nEmpolyee Number");
	    for(int i=0;i<size;i++) {
	    	int id=sc.nextInt();
	    	String name = sc.next();
	    	String city = sc.next();
	    	double turnover = sc.nextDouble();
	    	int emp = sc.nextInt();
	    	sc.close();
	    	obj[i] = new CompanyDetail(id,name,city,turnover,emp);
	   }
	    
	    for(CompanyDetail emp : obj) {
	    	emp.display();
	    }
		
	    System.out.println("Empolyee Greater then 100 in following company");
	    
	    for(CompanyDetail emp : obj) {
	    	if(emp.getEmp_number()>100)
	    		emp.display();
	    }
	    
     System.out.println("This company loacted at this is place patna");
	    
	    for(CompanyDetail emp : obj) {
	    	String name = "Patna";
	    	if(name.equals(emp.getCity())) {
	    		emp.display();
	    }
	    }
 System.out.println("Company name their turn over is between 1,000 to 10,000");
	    
	    for(CompanyDetail emp : obj) {
	    	if(emp.getTurnover()>1000 && emp.getTurnover()<10000) {
	    		emp.display();
	    	}
	    		
	    }

	}

}
