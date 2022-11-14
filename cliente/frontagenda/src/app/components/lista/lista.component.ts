import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {


  amigo = {
    nombre:'',
    telefono:''
  }

  amigos:any[] = []

 

  constructor(private http:HttpClient) { }

  ngOnInit(){
    this.http.get("http://localhost:8080/api/amigo/1").subscribe(
        res => {
          
          this.amigo = res

        }
    )
   
   
  }

}
