package com.firstmavaneproject.demo_firstmavenproject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoFirstmavenprojectApplication {

	public static void main(String[] args) {
		//BinarySearchimpl binarySearch = new BinarySearchimpl(new QuickSortAlgorithm());
		
		//application context
		ApplicationContext applicationContext = SpringApplication.run(DemoFirstmavenprojectApplication.class, args);
		BinarySearchimpl binarySearch = applicationContext.getBean(BinarySearchimpl.class);
		int result = binarySearch.binarySearch(new int[] {2, 5, 1, 9, 0}, 0);
		System.out.println(result);
	}

}
