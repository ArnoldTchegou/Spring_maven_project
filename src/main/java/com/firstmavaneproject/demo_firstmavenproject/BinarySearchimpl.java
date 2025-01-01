package com.firstmavaneproject.demo_firstmavenproject;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BinarySearchimpl {

	@Autowired
	private sortAlgorithm sortAlgorithm;
	

	/*
	 * public BinarySearchimpl(sortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// sorting logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// searching logic

		return 1;
	}

}
