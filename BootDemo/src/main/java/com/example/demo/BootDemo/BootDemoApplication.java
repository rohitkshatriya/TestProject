package com.example.demo.BootDemo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages="com.diff.pack")
public class BootDemoApplication {
	private static Logger logger = Logger.getLogger(BootDemoApplication.class);
	
	
	public static void main(String[] args) {
		logger.debug("Run method called");
		SpringApplication.run(BootDemoApplication.class, args);
	}
}
