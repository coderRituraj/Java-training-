package com.bhavna.task1Lambda;

import java.util.function.Supplier;

 

public class LambdaSupplier {

	public static void main(String[] args) {
		Supplier<Double> obj =()->Math.random();
		System.out.println(obj.get());

	}

}
