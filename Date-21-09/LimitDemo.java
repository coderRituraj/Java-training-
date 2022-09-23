package com.bhavna.Task1.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {
	public void displayLimit() {
		List<Integer> sort = Arrays.asList(90, 12, 32, 48, 23, 57, 44);
		List<Integer> sortedData = sort.stream().sorted().limit(10).collect(Collectors.toList());
		System.out.println("--------Before Sort----------");
		System.out.println(sort);
		System.out.println("--------After Sort----------");
		// System.out.println(sortedData);
	}

}
