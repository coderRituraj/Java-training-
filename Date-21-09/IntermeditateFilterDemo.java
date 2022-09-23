package com.bhavna.Task1.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermeditateFilterDemo {
	public void displayFilter() {
		List<String> filterObject = new ArrayList<String>();
		filterObject.add("King");
		filterObject.add("Richard");
		filterObject.add("Jam");
		filterObject.add("Ajay");
		filterObject.add("Fit 2 fight");
		List filterWord = filterObject.stream().filter(character ->character.startsWith("F")).collect(Collectors.toList());
		System.out.println(filterObject);
		System.out.println("------------------------------");
		System.out.println(filterWord);
		
		
	}
	

}
