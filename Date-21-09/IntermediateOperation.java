package com.bhavna.Task1.StreamApi;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperation {
	public void display() {
		List<Integer> mapObject = Arrays.asList(25,10,40,100);
		mapObject.stream().map(num->(num%2 ==0)).forEach(a->System.out.println("Even number is "+a));
		              
		
		
	}
	

}
