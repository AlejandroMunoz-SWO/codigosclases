import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html',
  styleUrls: ['./buscador.component.css']
})
export class BuscadorComponent implements OnInit {

  telefono:string = ""

  url:string = "http//localhost:8080/api/contacto/buscar-por-telefono"

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  buscar(){
    this.http.get(this.url+'/'+this.telefono).subscribe(
      res => console.log(res)
    )
    
  }

}
