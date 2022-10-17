interface IRobot{
    size:number,
    message:string,
    printMessage(text:string) :void
}

let miRobot:IRobot = {
    size: 30,
    message: 'Hola !!',
    printMessage(text:string) :void{
        console.log(text)
    }

}

interface IEmpleado{
    nombre:string,
    edad:number,
    datosEmpleado(nombre:string, edad:number) : void
}



class Empleado implements IEmpleado{

    nombre: string
    edad: number

    constructor(nom:string, age:number){
        this.nombre = nom
        this.edad = age
    }


    datosEmpleado(nombre: string, edad: number): void {
        console.log(nombre+' '+edad)
    }

    
}

let  empleadoUno = new Empleado('Pepe',34)
let  empleadoDos = new Empleado('Ana',40)

// empleadoUno.datosEmpleado(empleadoUno.nombre, empleadoDos.edad)
// empleadoDos.datosEmpleado(empleadoDos.nombre, empleadoDos.edad)



interface IEmpleadoTaller extends IEmpleado{
   plus:number
}

let empleadoTaller:IEmpleadoTaller = {
    nombre : 'Luis',
    edad: 34,
    plus:200,
    datosEmpleado(nombre:string, edad:number) :void{
        console.log(nombre+' '+edad +' '+ this.plus)
    }
}


empleadoTaller.datosEmpleado(empleadoTaller.nombre, empleadoTaller.edad)



 

