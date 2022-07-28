////// we run application from here

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication///// this marks the main class of a spring boot application
public class DemoApplication {

	public static void main(String[] args) {

			SpringApplication.run(DemoApplication.class, args);
	}

}
