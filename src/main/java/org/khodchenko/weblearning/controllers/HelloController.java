package org.khodchenko.weblearning.controllers;

import jakarta.annotation.security.PermitAll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    @PermitAll
    public String sayHello() {
        return "Hello, world!";
    }
}