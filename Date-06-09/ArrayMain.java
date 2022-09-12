package Com.bhavna.task1;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		System.out.println("Enter Length of 1D Array ");
		Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 sc.close();
		Array obj = new Array(size);
		obj.sum();
		obj.sum("s");
	

	}

}
