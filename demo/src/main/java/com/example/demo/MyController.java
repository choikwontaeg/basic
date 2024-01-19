package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    
    @RequestMapping("/")
    @ResponseBody    
    public String test() {        
        return "<h1>Hello</h1>";
    }
    
}
