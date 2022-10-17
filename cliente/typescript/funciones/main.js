"use strict";
// tipo de dato tupla ( array con valores fijos)
let usuarios;
//usuarios = [1, 'Pepe', true]
// tipo deto enum (sucesión de valores constantes)
//         0       1        2
var rol;
(function (rol) {
    rol["ADMIN"] = "admin";
    rol["USER"] = "user";
    rol["GESTOR"] = "gestor";
})(rol || (rol = {}));
let personas = {
    nombre: 'pepe',
    rol: rol.GESTOR
};
//console.log(personas.rol);
// tipo de dato union ( permitir que las variables puedan ser de tipos alternativos)
let individuo;
individuo = true;
// tipo de dato any (admite cualquier tipo de dato)
let coches = [23, 'Seat', 'ferrari'];
// tipo de dato undefined
let numero;
//console.log(numero)
// tipo de dato null
let boton = document.getElementById('bt');
//console.log(boton)
// void (indicar que una funcion no tiene retorno)
