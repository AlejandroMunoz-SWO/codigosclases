class Vehiculo{

    private matricula:string

    constructor(matricula:string){
        this.matricula = matricula
    }

    setMatricula(matricula:string) :void{
        this.matricula = matricula

    }

    getMatricula() :string{
        return this.matricula
    }
}

class Coche extends Vehiculo{

    private marca:string
    private modelo:string
    private precio:number

    constructor(marca:string, modelo:string, precio:number, matricula:string){

        super(matricula)


        this.marca = marca
        this.modelo = modelo
        this.precio = precio
    }

    setMarca(marca:string) : void{
        this.marca = marca
    }

    getMarca(): string{
        return this.marca
    }


}

let miCoche = new Coche('Kia','Ceed', 16000, '3455-KTC')

console.log(miCoche.getMarca())

miCoche.setMarca('Seat')


console.log(miCoche.getMatricula())

