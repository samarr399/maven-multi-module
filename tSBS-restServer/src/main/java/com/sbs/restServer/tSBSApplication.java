package com.sbs.restServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration
@CrossOrigin(allowedHeaders = "*", allowCredentials = "true")
public class tSBSApplication {

	public static void main(String[] args) {
		SpringApplication.run(tSBSApplication.class, args);
	}

}
