package com.project.oasis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class controller {

    @GetMapping("/")
    public String index() {
        return "frontend/index";
    }

    @GetMapping("/home")
    public String home() {
        return "frontend/index";
    }

}