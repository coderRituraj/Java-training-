/*
 Write program to throw and handle follwing exceptions explicitely. Use multiple catches
1.NullPointerException
2.ArithmeticException
3.FileNotFoundException
 */

package Com.bhavna.task2;

import java.io.*;
import java.util.Scanner;

public class MultipleCatchDemo  {
	public void display(int choice)   {
		
		try {
			int arr[]= new int[7];
			
			switch(choice) {
			case 1:
			arr[8]=10;
			case 2:
			arr[6] = 9/0;
			case 3:
			File file = new File("C:\\Users\\Rituraj.singh\\Documents\\master\\File2.txt");
			Scanner sc = new Scanner(file);
			
			}
			
			
		} catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception occurs");  
           }    
        catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }  
		catch(NullPointerException e) {
			System.out.println(" NullPointerException Exception occurs");
		}
		catch( FileNotFoundException e) {
			System.out.println(" FileNotFoundException Exception Occurs");
		}
	}
}



