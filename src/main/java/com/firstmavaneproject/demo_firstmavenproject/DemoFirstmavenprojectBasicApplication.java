package com.firstmavaneproject.demo_firstmavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstmavaneproject.demo_firstmavenproject.basic.BinarySearchimpl;

@Configuration
@ComponentScan("com.firstmavaneproject.demo_firstmavenproject.basic")
public class DemoFirstmavenprojectBasicApplication {

	public static void main(String[] args) {
		// BinarySearchimpl binarySearch = new BinarySearchimpl(new
		// QuickSortAlgorithm());

		// application context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoFirstmavenprojectBasicApplication.class);
		BinarySearchimpl binarySearch = applicationContext.getBean(BinarySearchimpl.class);
		int result = binarySearch.binarySearch(new int[] { 2, 5, 1, 9, 0 }, 0);
		System.out.println(result);
	}

}
