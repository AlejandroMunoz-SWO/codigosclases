package com.example.ejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

  @GetMapping("")
  public String enlaces(){
    return "enlaces";
  }

  @GetMapping("/get-enlaces")
  public String getEnlaces(@RequestParam Integer id, Model model){
    model.addAttribute("parametro", id);
    return "mostrarEnlaces";
  }
  
}
