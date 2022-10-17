"use strict";
let miRobot = {
    size: 30,
    message: 'Hola !!',
    printMessage(text) {
        console.log(text);
    }
};
class Empleado {
    constructor(nom, age) {
        this.nombre = nom;
        this.edad = age;
    }
    datosEmpleado(nombre, edad) {
        console.log(nombre + ' ' + edad);
    }
}
let empleadoUno = new Empleado('Pepe', 34);
let empleadoDos = new Empleado('Ana', 40);
let empleadoTaller = {
    nombre: 'Luis',
    edad: 34,
    plus: 200,
    datosEmpleado(nombre, edad) {
        console.log(nombre + ' ' + edad + ' ' + this.plus);
    }
};
empleadoTaller.datosEmpleado(empleadoTaller.nombre, empleadoTaller.edad);
