package com.example.ejercicio7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;

  @Column(name = "apellido_uno")
  private String apellidoUno;
  @Column(name = "apellido_dos")
  private String apellidoDos;

  private String posicion;
  private String equipo;

  public Jugador(){}

  public Jugador(Long id, String nombre, String apellidoUno, String apellidoDos, String posicion, String equipo) {
    this.id = id;
    this.nombre = nombre;
    this.apellidoUno = apellidoUno;
    this.apellidoDos = apellidoDos;
    this.posicion = posicion;
    this.equipo = equipo;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoUno() {
    return apellidoUno;
  }

  public void setApellidoUno(String apellidoUno) {
    this.apellidoUno = apellidoUno;
  }

  public String getApellidoDos() {
    return apellidoDos;
  }

  public void setApellidoDos(String apellidoDos) {
    this.apellidoDos = apellidoDos;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  public String getEquipo() {
    return equipo;
  }

  public void setEquipo(String equipo) {
    this.equipo = equipo;
  }

  

  







  
}
