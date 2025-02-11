package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {
    //http://localhost:8080/http://localhost:8080/09_RESTController_Web_exploded/variable/12
    @GetMapping(path = "/{id}")
    public String test1(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping(path = "/{id}/{name}")
    public String test2(@PathVariable("id") String id, @PathVariable String name) {
        return id + " " + name;
    }

    @GetMapping(path = "/{id:[A][0-9]{3}}")
    // "A" walin pattan ganna one,"0 to 9" wenakam ilakkam thiyenna one,full characters count eka 3 wennth one
    public String test3(@PathVariable("id") String id) {
        return id;
    }
}
