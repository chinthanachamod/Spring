package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.toString();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO test2() {
        return new CustomerDTO("Chinthana", "Chamod",25);
    }

    @GetMapping(path = "getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> test3() {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        list.add(new CustomerDTO("Chinthana", "Chamod",25));
        list.add(new CustomerDTO("Chinthana", "Chamod",25));
        list.add(new CustomerDTO("Chinthana", "Chamod",25));
        return list;
    }
}
