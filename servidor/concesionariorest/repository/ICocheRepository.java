package com.example.concesionariorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICocheRepository extends JpaRepository<Coche,Long> {
  
}
