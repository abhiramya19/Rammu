package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dem2Application {
	@GetMapping
	public String helloWorld()
	{
		return "hello ,how are you?";
	}


	public static void main(String[] args) {
		SpringApplication.run(Dem2Application.class, args);
	}

}
