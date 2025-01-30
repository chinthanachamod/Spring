package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController Constructor");
    }

    @GetMapping("/test1")
    public String hello() {
        return "Hello Spring Web MVC";
    }

    @GetMapping("/test2")
    public String test() {
        return "Hello Spring Web MVC Test";
    }
}
