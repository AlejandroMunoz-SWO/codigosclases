package com.example.ejercicio7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio7.model.Jugador;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador,Long> {
  
}
