package com.mdali.spring.springboot.selenium.cucumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class SpringBootSeleniumCucumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSeleniumCucumberApplication.class, args);
	}

}
