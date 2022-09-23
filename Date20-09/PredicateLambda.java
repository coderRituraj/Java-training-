package com.bhavna.task1Lambda;

import java.util.function.Predicate;

public class PredicateLambda {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Predicate<Integer> ref =(age)->age>18;
		System.out.println(ref.test(25));
*/
	
		myPredicate(25,(age)->age>=18);
	}
	public static void myPredicate(int age,Predicate<Integer> ref) {
		if(ref.test(age)) {
			System.out.println("Yes you are eligible");
		}
		else {
			System.out.println("Not eligible");
		}
	}

}
