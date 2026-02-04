package com.grader.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    public HelloWorldController() {
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
