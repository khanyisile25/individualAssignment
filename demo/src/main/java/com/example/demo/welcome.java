package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class welcome {
    @GetMapping({"/","/welcome"})
    public String Hi (@RequestParam(value = "name",
    defaultValue = "faith") String name, Model
    model) { model.addAttribute("name",name);
    return "welcome";


    }
}
