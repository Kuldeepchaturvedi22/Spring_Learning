package com.spring_learning.uc1;

import org.springframework.web.bind.annotation.*;

@RestController
public class SayHello {
    @GetMapping("/hello")
    public String hello () {
        return "Hello from BridgeLabz";
    }
}
