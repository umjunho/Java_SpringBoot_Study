package com.example.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApplication {

	// http://localhost:8080/pages/main
	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

}
