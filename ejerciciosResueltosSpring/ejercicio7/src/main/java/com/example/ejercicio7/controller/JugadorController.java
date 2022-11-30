package com.example.ejercicio7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio7.model.Jugador;
import com.example.ejercicio7.service.JugadorService;

@RestController
public class JugadorController {
 
  
  @Autowired
  private JugadorService jugadorService;

  @GetMapping("/lista-jugadores")
  public List<Jugador> list(){
    return jugadorService.jugadores();
  }
}
