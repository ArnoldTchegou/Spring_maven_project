package com.firstmavaneproject.demo_firstmavenproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstmavaneproject.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.firstmavaneproject.componentscan")
public class DemoFirstmavenprojectCdiApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(DemoFirstmavenprojectCdiApplication.class);

	public static void main(String[] args) {
		// BinarySearchimpl binarySearch = new BinarySearchimpl(new
		// QuickSortAlgorithm());

		// application context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoFirstmavenprojectCdiApplication.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
		applicationContext.close();
	}

}
