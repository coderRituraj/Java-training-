import java.util.*;

import area.area;
public class main {

	public void main(String[] args) {
	 Scanner n = new Scanner(System.in);
	 main a = new main();
	 System.out.print("Enter the number ");
	 int m =n.nextInt();
	 
	 /*
	 boolean flag = false;
	 for(int i=2;i<=m/2;++i)
	 {
		 if(m% i ==0)
		 {
			 flag = true;
			 break;
					
		 }
	 }
	 if(!flag)
		 System.out.println(m+ " is a prime number");
	 else 
		 System.out.println(m+ " is not prime ");
		 
		 */
	 int num=1,count=0,i;
	 while(count < m )
	 {
		 num = num+1;
		 for(i=2;i<num;i++) {
			 if(num%i==0)
			 {
				 break;
			 }
			 }
		    if(i==num)
		 {
			 count = count+1;
		 }
	 }
	 System.out.println("The Nth Prime number is " +num);
	 
	}


}
