package com.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EcommerceApplication.class);
		app.run(args);
	}

}
