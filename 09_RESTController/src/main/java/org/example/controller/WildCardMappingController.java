package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wildcard")
public class WildCardMappingController {

    //test 1 keyword ekay, hello keyword ekay atharata one ekak danna pluwn
    @GetMapping(path = "/test1/*/hello")
    public String test1() {
        return "Get Mapping 1 invoked";
    }

    @GetMapping(path = "/test2/*/*")
    public String test2() {
        return "Get Mapping 2 invoked";
    }

}
