import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  textoBoton:string = "Mostrar tabla"

  mostraTabla:boolean = false

  empleados = [
    {
      nombre:"Luis",
      sueldo:24000,
      antiguedad: 5
    },
    {
      nombre:"Marta",
      sueldo:25000,
      antiguedad: 10
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

  tableRender(){

    this.mostraTabla = !this.mostraTabla

    if(this.mostraTabla){
      this.textoBoton = "Ocultar tabla"
    }
    if(!this.mostraTabla){
      this.textoBoton = "Mostrar tabla"
    }

    

  }

}
