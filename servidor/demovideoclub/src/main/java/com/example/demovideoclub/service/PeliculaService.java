package com.example.demovideoclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demovideoclub.model.Pelicula;
import com.example.demovideoclub.repository.IPeliculaRepsoitory;

@Service
public class PeliculaService {

  @Autowired
  private IPeliculaRepsoitory peliculaRepsoitory;

  public List<Pelicula> listaPeliculas(){
    return peliculaRepsoitory.findAll();
  }

  public List<Pelicula> filmsByDirector(String director){
    return peliculaRepsoitory.findByDirector(director);

  }
  
}
