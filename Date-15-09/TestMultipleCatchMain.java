package Com.bhavna.task2;

import java.util.Scanner;

public class TestMultipleCatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCatchDemo  object = new MultipleCatchDemo ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice here \n1 For Array \n2 For Arthematics \n3 for Work on file");
		int choice= sc.nextInt();
		object.display(choice);

	}

}
