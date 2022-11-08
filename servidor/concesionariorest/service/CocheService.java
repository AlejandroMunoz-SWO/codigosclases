package com.example.concesionariorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.concesionariorest.repository.Coche;
import com.example.concesionariorest.repository.ICocheRepository;

@Service
public class CocheService {

  @Autowired
  private ICocheRepository cocheRepository;

  public List<Coche> carsList(){
    return cocheRepository.findAll();
  }

  public Coche findCarById(Long id){
    return cocheRepository.findById(id).orElse(null);
  }

  public Coche saveCar(Coche coche){
    return cocheRepository.save(coche);
  }

  public void deleteCar(Long id){
    cocheRepository.deleteById(id);
  }


  
}
