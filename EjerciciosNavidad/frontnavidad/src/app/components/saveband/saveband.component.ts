import { Component, OnInit } from '@angular/core';
import { Band } from 'src/app/models/Band';
import { BandService } from 'src/app/services/band.service';

@Component({
  selector: 'app-saveband',
  templateUrl: './saveband.component.html',
  styleUrls: ['./saveband.component.css']
})
export class SavebandComponent implements OnInit {

  band:Band = new Band()

  constructor(private bandService:BandService) { }

  ngOnInit(): void {
  }

  save(){
    this.bandService.saveBand(this.band).subscribe(
      res=>{
        console.log(res)
      }
    )

  }



}
