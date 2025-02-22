package com.spring_learning.uc1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello () {
        return "Hello";
    }
    @GetMapping("/web/message")
    public String message (Model model) {
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
