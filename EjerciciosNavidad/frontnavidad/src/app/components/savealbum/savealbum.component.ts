import { Component, OnInit } from '@angular/core';
import { Album } from 'src/app/models/Album';
import { AlbumService } from 'src/app/services/album.service';
import { BandService } from 'src/app/services/band.service';

@Component({
  selector: 'app-savealbum',
  templateUrl: './savealbum.component.html',
  styleUrls: ['./savealbum.component.css']
})
export class SavealbumComponent implements OnInit {

  album:Album = new Album()

  bands:any = []

  constructor(private albumService: AlbumService, private bandService:BandService) { }

  ngOnInit(): void {
    this.loadBands()
  }

  loadBands(){

    this.bandService.bandsList().subscribe(
      res=>{
        //console.log(res)
        this.bands = res

        //console.log(this.bands)
      }
    )

  }


  save(){
     this.albumService.saveAlbum(this.album).subscribe(
      res=>{
        console.log(res)
      }
    )
  }

}
