package com.example.condicionales.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondicionalController {

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @PostMapping("/get-form")
    public String getForm(Model model,
    @RequestParam(name = "username")String nombre, @RequestParam(name = "email")String email){
        model.addAttribute("usuario", nombre);
        model.addAttribute("email", email);
        return "home";
    }

  
  
    
}
