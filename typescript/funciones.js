"use strict";
// funciones sin retorno y sin parametros
function message() {
    console.log('Hola');
}
//message()
// funciones sin retorno y con parámetros
function dameNombre(nombre) {
    console.log(nombre);
}
//dameNombre('Luis')
// funciones con parámetros y con retorno
function demo(numero) {
    return numero;
}
//console.log(demo(89))
// variables como funciones
function demostracion(nombre) {
    return nombre;
}
let prueba = demostracion;
let persona = {
    nombre: 'paco',
    navegador: 'edge'
};
