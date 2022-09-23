package com.bhavna.Task1.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateSortDemo {
	public void displaySort() {
		List<Integer> sort = Arrays.asList(90, 12, 32, 48, 23, 57, 32, 44);
		List sortedData = sort.stream().sorted().collect(Collectors.toList());
		System.out.println("--------Before Sort----------");
		System.out.println(sort);
		System.out.println("--------After Sort----------");
		System.out.println(sortedData);

	}

}
