package com.example.ejercicio9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio9.model.Zapato;

@Repository
public interface IZapatoRepository extends JpaRepository<Zapato,Long>{
  
}
