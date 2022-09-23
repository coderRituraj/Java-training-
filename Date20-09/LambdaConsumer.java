package com.bhavna.task1Lambda;

import java.util.function.Consumer;

public class LambdaConsumer {

	public static void main(String[] args) {
		Consumer<Integer> obj = (num)->{
			if(num <10) {
				System.out.println("Enter number is "+num+" less than 10");
			}else
			{
				System.out.println("Number is greater than 10");
			}
		};
		obj.accept(1);
		obj.accept(20);

	}

}
