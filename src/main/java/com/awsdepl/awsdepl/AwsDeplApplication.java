package com.awsdepl.awsdepl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.awsdepl.awsdepl.controller.PersonController;

@SpringBootApplication()
public class AwsDeplApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeplApplication.class, args);
	}

}
