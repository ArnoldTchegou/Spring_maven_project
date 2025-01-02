package com.firstmavaneproject.demo_firstmavenproject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements sortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for Quick sorting
		return numbers;
	}

}
