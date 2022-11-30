package com.example.ejercicio5.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @GetMapping("/form")
  public String form(){
    return "form";
  }

  @PostMapping("/login-post")
  public String login(@RequestParam String username, 
    @RequestParam String password, HttpSession session){

      if(username.equalsIgnoreCase("Pepe") && password.equals("12345")){
        session.setAttribute("username", username);
        return "redirect:/home";
      }

      return "redirect:/no-auth";
  }

  @GetMapping("/home")
  public String home(HttpSession session,Model model){
    String nombreUsuario = (String)session.getAttribute("username");

    model.addAttribute("nombreUsuario", nombreUsuario);
    return "home";
  }

  @GetMapping("/no-auth")
  public String noAutorizado(){
    return "noAuth";
  }
  
}
