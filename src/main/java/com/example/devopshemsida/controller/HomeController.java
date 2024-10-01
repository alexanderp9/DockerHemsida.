package com.example.devopshemsida.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/login")
    public String home(Model model) {

        return "login";

    }

    @GetMapping("/register")
    public String register (Model model) {
        return "register";
    }

}
