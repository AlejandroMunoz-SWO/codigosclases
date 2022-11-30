package com.example.ejercicio9.controller;

import org.hibernate.type.StringNVarcharType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ejercicio9.model.Zapato;
import com.example.ejercicio9.service.ZapatoService;

@Controller
public class ZapatoController {

  @Autowired
  private ZapatoService zapatoService;

  @GetMapping("/{id}")  // http://localhost:8080/zapato/1
  public String  buscar(@PathVariable Long id, Model model){
    model.addAttribute("zapato", zapatoService.buscarZapato(id));
    return "zapato";
  }

  @GetMapping("/lista-zapatos")
  public String lista(Model model){
    model.addAttribute("zapatos", zapatoService.listaZapatos());
    return "lista";
  }

  @GetMapping("/delete/{id}")
  public String eliminar(@PathVariable Long id){
    zapatoService.eliminarZapato(id);
    return "redirect:/lista-zapatos";
  }



  
}
