package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(){
        return "index"; //"index" is a Spring view name. Since we use thymeleaf , Spring appends .html to view name under src/main/resources/templates
    }
}
