package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
public class FormDataController {
    //id - 1
    //name - Chamod
    //address - Panadura

    @PostMapping
    public String test1(@RequestParam("id") String id, @RequestParam("name") String name) {
        return id + " " + name;
    }

    @PostMapping(path = "/test2t")
    public String test2(CustomerDTO customerDTO) {
        return customerDTO.toString();
    }
}
