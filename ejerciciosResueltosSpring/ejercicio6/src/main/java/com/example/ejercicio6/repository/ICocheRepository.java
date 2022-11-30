package com.example.ejercicio6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio6.model.Coche;

@Repository
public interface ICocheRepository extends JpaRepository<Coche,Long> {
  
}
