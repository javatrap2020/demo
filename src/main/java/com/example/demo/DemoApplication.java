package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/app")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello from aws";
//	}
//
//	@GetMapping("/")
//	public String sayHello2() {
//		return "Hello from aws";
//	}

}
