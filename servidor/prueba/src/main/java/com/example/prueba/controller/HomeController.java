package com.example.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/inicio")
    public String home(Model model){

        String color = "rojo";

        model.addAttribute("color", color);


        return "inicio";
    }
    
}
