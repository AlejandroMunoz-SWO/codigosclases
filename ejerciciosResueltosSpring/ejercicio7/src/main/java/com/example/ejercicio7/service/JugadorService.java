package com.example.ejercicio7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio7.model.Jugador;
import com.example.ejercicio7.repository.IJugadorRepository;

@Service
public class JugadorService {

  @Autowired
  private IJugadorRepository jugadorRepository;

  public List<Jugador> jugadores(){
    return jugadorRepository.findAll();
  }



  


}
