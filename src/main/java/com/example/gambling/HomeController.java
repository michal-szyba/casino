package com.example.gambling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @RequestMapping(value = "/first")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/sample")
    public String sample(){
        return "sample";
    }
}
