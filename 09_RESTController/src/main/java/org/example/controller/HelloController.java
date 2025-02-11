package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*@RestController*/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Get Mapping Invoked";
    }

    @PostMapping
    public String sayHelloPost() {
        return "Post Mapping Invoked";
    }

    @DeleteMapping
    public String sayHelloDelete() {
        return "Delete Mapping Invoked";
    }

    @PutMapping
    public String sayHelloPut() {
        return "Put Mapping Invoked";
    }

    @PatchMapping
    public String sayHelloPatch() {
        return "Patch Mapping Invoked";
    }
}
