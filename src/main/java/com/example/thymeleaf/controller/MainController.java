package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {


    @GetMapping("/home")
    public String Hello(Model model){
        model.addAttribute("name","Thymeleaf");
        return "index";
    }

    @GetMapping("/elvis")
    public String elvis(Model model){
        model.addAttribute("isAdmin",true);
        model.addAttribute("gender","whbxd");
        return "elvis";
    }
    @GetMapping("/each")
    public String eachExample(Model model){
        List<String> stringList=List.of("First","Second","Third");
        model.addAttribute("list",stringList);
        return "each";
    }
}
