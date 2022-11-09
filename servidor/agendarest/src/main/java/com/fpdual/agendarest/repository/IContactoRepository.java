package com.fpdual.agendarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fpdual.agendarest.model.Contacto;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Long>{
  
}
