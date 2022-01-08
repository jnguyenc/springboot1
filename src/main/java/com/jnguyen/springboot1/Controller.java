package com.jnguyen.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/device")
    public String device() {
        return "This is the page for device";
    }

    @GetMapping("/name")
    public String name() {
        return "This is the page for name";
    }

    @GetMapping("/id")
    public String id() {
        return "This is the page for id";
    }

    @GetMapping("/type")
    public String type() {
        return "This is the page for type";
    }

}