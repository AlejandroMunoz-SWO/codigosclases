"use strict";
class Vehiculo {
    constructor(matricula) {
        this.matricula = matricula;
    }
    setMatricula(matricula) {
        this.matricula = matricula;
    }
    getMatricula() {
        return this.matricula;
    }
}
class Coche extends Vehiculo {
    constructor(marca, modelo, precio, matricula) {
        super(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    setMarca(marca) {
        this.marca = marca;
    }
    getMarca() {
        return this.marca;
    }
}
let miCoche = new Coche('Kia', 'Ceed', 16000, '3455-KTC');
console.log(miCoche.getMarca());
miCoche.setMarca('Seat');
console.log(miCoche.getMatricula());
