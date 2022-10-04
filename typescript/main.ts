// tipo de dato tupla ( array con valores fijos)

let usuarios: [number, string, boolean]


//usuarios = [1, 'Pepe', true]

// tipo deto enum (sucesión de valores constantes)


//         0       1        2
enum rol{'ADMIN'= 'admin','USER' = 'user', 'GESTOR' = 'gestor'}

let personas : {
    nombre:string,
    rol:rol
} = {
    nombre: 'pepe',
    rol: rol.GESTOR
}

//console.log(personas.rol);

// tipo de dato union ( permitir que las variables puedan ser de tipos alternativos)


let individuo: number | string | boolean

individuo = true


// tipo de dato any (admite cualquier tipo de dato)

let coches:any[] = [23,'Seat','ferrari']

// tipo de dato undefined

let numero:number

//console.log(numero)

// tipo de dato null

 let boton = document.getElementById('bt')

 //console.log(boton)


 // void (indicar que una funcion no tiene retorno)


















































