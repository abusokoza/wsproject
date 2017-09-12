package com.ws.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * Spring boot configuration for embedded Tomcat server
 * 
 * @author alainbusokoza
 *
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.ws.project","com.ws.project.service","com.ws.project.dao","com.ws.domain","com.ws.project.service.impl"})
public class DevAppConfig {

	/**
	 * Spring boot application entry point
	 * @param args
	 */
	public static void main (String[] args) {
		SpringApplication.run(DevAppConfig.class, args);
	}
}
