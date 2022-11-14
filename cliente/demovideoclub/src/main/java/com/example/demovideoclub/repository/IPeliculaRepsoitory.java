package com.example.demovideoclub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demovideoclub.model.Pelicula;

@Repository
public interface IPeliculaRepsoitory extends JpaRepository<Pelicula,Long> {
  List<Pelicula> findByDirector(String director);
  
}
