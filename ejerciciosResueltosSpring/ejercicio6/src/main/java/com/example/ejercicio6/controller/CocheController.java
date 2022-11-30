package com.example.ejercicio6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ejercicio6.model.Coche;
import com.example.ejercicio6.service.CocheService;

@Controller
public class CocheController {

  @Autowired
  private CocheService cocheService;

  @GetMapping("/form")
  public String form(Model model){
    model.addAttribute("coche", new Coche());
    return "form";
  }

  @PostMapping("/save")
  public String save(Coche coche){
    cocheService.saveCar(coche);
    return "redirect:/list";

  }

  @GetMapping("/list")
  public String lista(Model model){
    model.addAttribute("coches", cocheService.listadoCoches());
    return "lista";
  }
  
}
