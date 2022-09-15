/*
 * Write program to demonstrate use of try with resource
 */

package Com.bhavna.task2;

import java.util.Scanner;

public class TryWithResourceDemo {
	public void trywithresource() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter any Name ");
			String name = sc.next();
			System.out.println("You have Enter this String : "+name);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
