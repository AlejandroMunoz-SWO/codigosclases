package com.example.demovideoclub.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demovideoclub.model.Pelicula;
import com.example.demovideoclub.service.PeliculaService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/pelicula")
public class PeliculaController {

  @Autowired
  private PeliculaService peliculaService;


  @GetMapping("/lista")
  public List<Pelicula> peliculas(){   // http://localhost:8080/api/pelicula/lista
    return peliculaService.listaPeliculas();
  }

  @GetMapping("/find/{director}") // http://localhost:8080/api/pelicula/find/Steven Spielberg
  public List<Pelicula> find(@PathVariable String director){
    return peliculaService.filmsByDirector(director);


  }
  
}
