package com.example.pruebaredirecciones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/home")
    public String home(){
        return "home";

    }

    @PostMapping("/login")
    public String formPost(@RequestParam String username,
                           @RequestParam String password, RedirectAttributes flash){

        if(username.equals("Paco") && password.equals("1234")){
            flash.addFlashAttribute("usuario", username);
            return "redirect:/home";
        }
        else{
            return "redirect:/auth-error";

        }

    }
    
}
