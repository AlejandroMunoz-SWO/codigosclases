package com.example.concesionariorest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.concesionariorest.repository.Coche;
import com.example.concesionariorest.service.CocheService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/coche")
public class CocheRestController {

  @Autowired
  private CocheService cocheService;


  @GetMapping("/list")
  public List<Coche> list(){
    return cocheService.carsList();
  }

  @GetMapping("/{id}")
  public Coche findById(@PathVariable Long id){
    return cocheService.findCarById(id);
  }

  @PostMapping("/save")
  public Coche save(@RequestBody Coche coche){
    return cocheService.saveCar(coche);
  }

  @PutMapping("/update/{id}")
  public Coche update(@PathVariable Long id, @RequestBody Coche coche ){

    Coche cocheEncontrado = cocheService.findCarById(id);

    cocheEncontrado.setMarca(coche.getMarca());
    cocheEncontrado.setModelo(coche.getModelo());
    cocheEncontrado.setPrecio(coche.getPrecio());

    return cocheService.saveCar(cocheEncontrado);

  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable Long id){
    cocheService.deleteCar(id);
  }




  
}
