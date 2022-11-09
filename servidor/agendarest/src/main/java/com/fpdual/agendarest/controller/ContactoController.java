package com.fpdual.agendarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpdual.agendarest.model.Contacto;
import com.fpdual.agendarest.service.ContactoService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

  @Autowired
  private ContactoService contactoService;

  @GetMapping("/lista")  // ====  http://localhost:8080/api/contacto/lista
  public List<Contacto> lista(){
    return contactoService.listaContactos();
  }


  @GetMapping("/{id}")  // ====  http://localhost:8080/api/contacto/1
  public Contacto lista(@PathVariable Long id){
    return contactoService.buscarContacto(id);
  }


  @PostMapping("/guardar")  // ====  http://localhost:8080/api/contacto/save
  public Contacto guardar(@RequestBody Contacto contacto){
    return contactoService.guardarContacto(contacto);
  }

  @DeleteMapping("/eliminar/{id}")  // ====  http://localhost:8080/api/contacto/save
  public void guardar(@PathVariable Long id){
    contactoService.eliminarContacto(id);
  }

 

  @PutMapping("{id}")
  public Contacto modificar(@RequestBody Contacto contacto, 
                            @PathVariable Long id){

    Contacto contactoEncontrado = contactoService.buscarContacto(id);

    contactoEncontrado.setNombre(contacto.getNombre());
    contactoEncontrado.setApellidoUno(contacto.getApellidoUno());
    contactoEncontrado.setApellidoDos(contacto.getApellidoDos());
    contactoEncontrado.setTelefono(contacto.getTelefono());

    return contactoService.guardarContacto(contactoEncontrado);
  }
  
}
