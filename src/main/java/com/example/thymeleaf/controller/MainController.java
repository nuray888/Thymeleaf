package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/home")
    public String Hello(Model model){
        model.addAttribute("name","Thymeleaf");
        return "index";
    }

//    @GetMapping("/elvis")
//    public String elvis(Model model){
//        model.addAttribute("isAdmin",true);
//        return "elvis";
//    }
}
