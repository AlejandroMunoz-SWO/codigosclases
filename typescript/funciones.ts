// funciones sin retorno y sin parametros

function message():void{
    console.log('Hola')
}

//message()


// funciones sin retorno y con parámetros

function dameNombre(nombre:string) :void{
    console.log(nombre)
}

//dameNombre('Luis')

// funciones con parámetros y con retorno


function demo(numero:number): number{

    return numero
}

//console.log(demo(89))


// variables como funciones

function demostracion(nombre:string):string{
    return nombre;
}

let prueba:Function =  demostracion

//console.log(prueba('Juan'))


// Varoables de tipo literal

type browser = 'chrome' | 'firefox' | 'edge'

let persona: {
    nombre:string,
    navegador:browser
} = {

    nombre:'paco',
    navegador:'edge'
}






















