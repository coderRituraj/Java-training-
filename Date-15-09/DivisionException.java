/*
 Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. 
 
This program generates DivideByZeroException when the denominator is zero. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output. 
 Also illustrate the use of finally block. Print the message “Inside finally block”.
 */

package Com.bhavna.task1;

public class DivisionException {
	public void division(int a, int b) {
		try {
			int c = a/b;
			System.out.println("If"+a+"Division by"+b+"is equal to "+c);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block Run");
		}
		
	}

}
