package com.spring_learning.uc3;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWebController {
    @GetMapping("/hello")
    public String hello () {
        return "Hello from BridgeLabz";
    }
}
