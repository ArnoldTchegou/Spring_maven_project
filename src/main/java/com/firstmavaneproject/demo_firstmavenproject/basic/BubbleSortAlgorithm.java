package com.firstmavaneproject.demo_firstmavenproject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements sortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for sorting
		return numbers;
	}

}
