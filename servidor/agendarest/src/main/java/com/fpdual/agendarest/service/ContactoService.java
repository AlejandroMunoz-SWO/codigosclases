package com.fpdual.agendarest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpdual.agendarest.model.Contacto;
import com.fpdual.agendarest.repository.IContactoRepository;

@Service
public class ContactoService {

  @Autowired
  private IContactoRepository contactoRepository;


  public List<Contacto> listaContactos(){
    return contactoRepository.findAll();
  }

  public Contacto buscarContacto(Long id){
    return contactoRepository.findById(id).orElse(null);
  }

  public Contacto guardarContacto(Contacto contacto){
    return contactoRepository.save(contacto);
  }

  public void eliminarContacto(Long id){
     contactoRepository.deleteById(id);
  }

  
}
