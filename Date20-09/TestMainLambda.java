package com.bhavna.task1TestDemoLambda;

import com.bhavna.task1Lambda.LambdaExpression;
import com.bhavna.task1Lambda.LambdaWithoutParameter;

public class TestMainLambda {

	public static void main(String[] args) {
		LambdaExpression lambdaobj ;
		//Lambda Expression with parameter
		//Lambda Block Example
		lambdaobj=(value1,value2)->{
			int result = value1+value2;
			System.out.println("Addition of two number "+result);
		};
		lambdaobj.show(8,8);
		
		//Lambda Expression with two parameter.
		lambdaobj =(value1,value2)->System.out.println("Multiplication of "+value1+"and "+value2+": "+(value2*value1));
		lambdaobj.show(8,8);
		
		
		
		// Without parameter lambda expression 
		
		LambdaWithoutParameter obj ;
		 obj = ()-> {
			 return"Hello Man";
		 };
		 
		 
		 // Return type lambda Expression 
		System.out.println(obj.show());
		



	}

}
