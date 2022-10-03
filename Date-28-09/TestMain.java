package TestJunit;

import Com.Bhavna.Maven.Junit.Calculator;

public class TestMain {
	public static void main(String[] args) {
		Calculator calobj = new Calculator();
		System.out.println("Addition Funtion "+calobj.addition(10, 10));
		System.out.println("Addition Funtion with double "+ calobj.addition(13.3, 12.44));
		System.out.println("Addition Funtion with string "+calobj.addition("Ram", "Sita"));
		System.out.println("Subtraction Funtion "+calobj.substraction(10, 5));
		System.out.println("Multiplication block "+calobj.multiplication(13, 10));
		System.out.println("Division Funtion "+calobj.division(10, 0));
		
	}

}
