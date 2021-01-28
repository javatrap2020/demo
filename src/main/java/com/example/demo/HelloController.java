package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from aws";
    }

    @GetMapping("/")
    public String sayHello2() {
        return "Hello from aws";
    }
}
