package com.example.ejercicio9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio9.model.Zapato;
import com.example.ejercicio9.service.ZapatoService;

@RestController
public class ZapatoRestController {

  @Autowired
  private ZapatoService zapatoService;

  @GetMapping("/zapato/{id}")  // http://localhost:8080/zapato/1
  public Zapato buscar(@PathVariable Long id){
    return zapatoService.buscarZapato(id);
  }
  
}
