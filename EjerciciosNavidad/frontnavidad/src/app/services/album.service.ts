import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import {  Observable } from 'rxjs'
import { Album } from '../models/Album';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {


  URL:string = "http://localhost:8080/api/album"

  headers:HttpHeaders = new HttpHeaders({'Content-Type' : 'application/json'})

  constructor(private http:HttpClient) { }

  // GUARDAR ÁLBUM
  saveAlbum(album:Album) :Observable<Album>{
    return this.http.post<Album>(this.URL+'/save', album,  {headers:this.headers})
  }


}
