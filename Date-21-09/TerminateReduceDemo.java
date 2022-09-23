package com.bhavna.Task1.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminateReduceDemo {
	public void reduceDisplay() {
		List<Integer> reduce = Arrays.asList(90,12,32,48,23,57,32,44);
		int reducedData =reduce.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		  
		System.out.println("--------Before reduce----------");
		System.out.println(reduce);
		System.out.println("--------After reduce----------");
		System.out.println(reducedData);
	}

}
