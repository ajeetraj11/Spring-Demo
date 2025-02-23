package com.springdemo.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks the class as a REST controller
@RestController
@RequestMapping("/api")
public class HelloWorldController {

     // Maps HTTP GET requests to /hello to this method
     @GetMapping("/hello")
     public String sayHello() {
          // Returns a simple greeting message
          return "Hello from BridgeLabz";
     }
}
