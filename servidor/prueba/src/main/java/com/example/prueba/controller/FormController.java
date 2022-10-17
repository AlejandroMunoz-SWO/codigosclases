package com.example.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
  

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/get-form")
    public String getForm(Model model, @RequestParam(name = "id") Integer numero){

        model.addAttribute("numero", numero);



        

        return "home";
    }
    
}
