package com.example.ejercicio6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio6.model.Coche;
import com.example.ejercicio6.repository.ICocheRepository;

@Service
public class CocheService {

  @Autowired
  private ICocheRepository cocheRepository;

  public void saveCar(Coche coche){
    cocheRepository.save(coche);
  }

  public List<Coche> listadoCoches(){
    return cocheRepository.findAll();
  }
  
}
