package com.firstmavaneproject.demo_firstmavenproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.firstmavaneproject.componentscan.properties.ExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoFirstmavenprojectScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(DemoFirstmavenprojectScopeApplication.class);

	public static void main(String[] args) {
		// BinarySearchimpl binarySearch = new BinarySearchimpl(new
		// QuickSortAlgorithm());

		// application context
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				DemoFirstmavenprojectScopeApplication.class);
		ExternalService service = applicationContext.getBean(ExternalService.class);

		LOGGER.info("{}", service.returnServiceURL());

	}

}
