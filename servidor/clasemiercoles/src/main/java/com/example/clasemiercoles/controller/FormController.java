package com.example.clasemiercoles.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/post-form")
    public String formPost(@RequestParam String username,
     @RequestParam String password, HttpSession session){

        if(username.equals("Paco") && password.equals("1234")){
            session.setAttribute("user", username);
            return "redirect:/private/home";
        }
        else{
            return "redirect:/errores/auth-error";
        }
       
       
    }
    
}
