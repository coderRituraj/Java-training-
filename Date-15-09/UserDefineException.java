/*
 * Write a program that accepts the age of the user as input. When the age of the user is less than 19, a custom exception named InvalidAgeException is thrown. 
Use exception handling mechanisms to handle this exception.
 */


package Com.bhavna.task2;

public class UserDefineException {
	public void validate(int age ) {
		
		try{if(age<19) {
			throw new InvalidAgeException("Age is less then 19");
		}
		else {
			System.out.println("Your are right");
		}}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

