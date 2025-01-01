package com.firstmavaneproject.demo_firstmavenproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements sortAlgorithm {
	public int[] sort(int[] numbers) {
		//logic for Quick sorting
		return numbers;
	}

}
