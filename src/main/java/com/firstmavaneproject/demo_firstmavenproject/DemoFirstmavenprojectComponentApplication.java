package com.firstmavaneproject.demo_firstmavenproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstmavaneproject.demo_firstmavenproject.scope.PersonDAO;

@Configuration
@ComponentScan
public class DemoFirstmavenprojectComponentApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(DemoFirstmavenprojectComponentApplication.class);

	public static void main(String[] args) {
		// BinarySearchimpl binarySearch = new BinarySearchimpl(new
		// QuickSortAlgorithm());

		// application context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoFirstmavenprojectComponentApplication.class);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcCo());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcCo());

	}

}
