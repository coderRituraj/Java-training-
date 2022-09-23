package com.bhavna.Task1.StreamApi;

public class TestMain {

	public static void main(String[] args) {
		// Calling Map and Foreach method
		IntermediateOperation obj = new IntermediateOperation();
		// obj.display();

		// Call Filter Fuction
		IntermeditateFilterDemo fltrobj = new IntermeditateFilterDemo();
		fltrobj.displayFilter();
		System.out.println("\n");

		//
		IntermediateSortDemo sortobj = new IntermediateSortDemo();
		sortobj.displaySort();
		System.out.println("\n");

		TerminateReduceDemo reduceobj = new TerminateReduceDemo();
		reduceobj.reduceDisplay();

		LimitDemo limitobj = new LimitDemo();
		limitobj.displayLimit();

	}

}
