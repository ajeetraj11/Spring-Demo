package com.springdemo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Marks this class as a controller that handles web requests
@Controller
public class HelloController {

     // Handles GET requests to /hello and adds a message to the model
     @GetMapping("/sayHello")
     public String sayHello(Model model) {
          // Adding the message attribute to the model
          model.addAttribute("message", "Hello from BridgeLabz");

          // Returning the name of the Thymeleaf view (hello.html)
          return "hello";
     }
}
