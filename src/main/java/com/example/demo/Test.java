package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/hello")
    public String helloWorld()
    {
        return "hello world !";
    }
}
