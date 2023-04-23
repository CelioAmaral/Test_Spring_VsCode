package com.example.spring_test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Ola {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Let's code";
    }

}
