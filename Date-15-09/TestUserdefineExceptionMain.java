package Com.bhavna.task2;

import java.util.Scanner;

public class TestUserdefineExceptionMain {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter age here ");
			int age = sc.nextInt();
			UserDefineException obj = new UserDefineException();
			obj.validate(age);
	
		

	}

}
