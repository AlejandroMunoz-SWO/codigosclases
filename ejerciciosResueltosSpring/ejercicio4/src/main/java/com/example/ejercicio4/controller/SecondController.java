package com.example.ejercicio4.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

  @GetMapping("/form")
  public String form(){
    return "form";
  }

  @PostMapping("/get-post")
  public String getPost(@RequestParam String username, 
    @RequestParam String email, Model model){
      model.addAttribute("username", username);
      model.addAttribute("email", email);


    return "formData";


  }
  
}
