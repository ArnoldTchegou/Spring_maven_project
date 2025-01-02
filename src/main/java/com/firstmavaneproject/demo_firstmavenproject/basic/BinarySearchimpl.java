package com.firstmavaneproject.demo_firstmavenproject.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchimpl {

	@Autowired
	@Qualifier("quick")
	private sortAlgorithm sortAlgorithm;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

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
