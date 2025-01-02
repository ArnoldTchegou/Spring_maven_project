package com.firstmavaneproject.demo_firstmavenproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstmavaneproject.demo_firstmavenproject.basic.cdi.CDIExample;

@Configuration
@ComponentScan
public class DemoFirstmavenprojectPropertiesApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(DemoFirstmavenprojectPropertiesApplication.class);

	public static void main(String[] args) {
		// BinarySearchimpl binarySearch = new BinarySearchimpl(new
		// QuickSortAlgorithm());

		// application context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoFirstmavenprojectPropertiesApplication.class);
		CDIExample componentDao = applicationContext.getBean(CDIExample.class);

		LOGGER.info("{} cdi - {}", componentDao, componentDao.getCdidao());

	}

}
