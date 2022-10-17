"use strict";
// MÉTODOS DE LOS ARRAYSS
//  0        1       2       3
let nombresUno = ['Ana', 'Lucía', 'Pepe', 'Martin'];
let nombresDos = ['Alberto', 'Luis'];
let numeros = [70, 12, 110, 10];
// 1 ) forEach - Recorrer arrays
// nombres.forEach( (nombre:string):void => {
//     console.log(nombre)
// })
// nombres.forEach( function(nombre:string):void{
//     console.log(nombre)
// })
// nombres.forEach( (value:string, index:number):void => {
//     console.log(index + ' ' + value)
// } )
// numeros.forEach( (value:number, index:number) :void => {
//     if(value >=  100){
//         console.log(value)
//     }
// })
// 2) concat() - Concatenar arrays
// let nuevoArray = nombresUno.concat(nombresDos)
// nuevoArray.forEach( (nuevo:string) :void => {
//     console.log(nuevo)
// });
// 3) slice() - Devuleve un array segmentada en función de unas condiciones
// console.log(nombresUno.slice(0,3))
// 4) push() - Añadir elementos a un array =================================
// nombresUno.push('Lucas', 'Emilio')
// console.log(nombresUno)
// 5) filter() - devuelve un array flitrado por una seried de condiciones
// console.log(numeros.filter( (numero:number):boolean => numero > 100))
// 6) find() - Igual que filter  pero solo devuleve el primer valor
// console.log(numeros.find( (numero:number):boolean => numero >=100) )
// console.log( numeros.find( function(numero:number){
//     return numero >= 10
// } )   )
// 7) join() - Modifica el separador por defecto de los arrays =========
// console.log(numeros.join('.'))
// 8) map() - Crea un array nuevo bajo unas condiciones ==========
//  console.log(  numeros.map( (numero :number):number => numero * 2) )
// console.log(numeros.map(function(numero:number): number{
//     return numero * 2
// }) )
// 9) sort() =========================================================
numeros.sort((a, b) => {
    if (a == b) {
        return 0;
    }
    if (a < b) {
        return -1;
    }
    else {
        return 1;
    }
});
console.log(numeros);
