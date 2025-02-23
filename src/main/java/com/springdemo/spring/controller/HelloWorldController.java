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

     // Handles GET requests to /api/ and responds with a simple message
     @GetMapping("/")
     public String displayGreeting() {
          // Returns the greeting message as the response
          return "Hello from BridgeLabz";
     }

     // Handles GET requests to /api/helloworld
     @GetMapping("/helloworld")
     public String sayHelloWorld() {
          // Returns a simple hello message
          return "Hello from BridgeLabz";
     }

}
