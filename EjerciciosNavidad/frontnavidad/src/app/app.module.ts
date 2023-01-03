import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { SavebandComponent } from './components/saveband/saveband.component';
import { SavealbumComponent } from './components/savealbum/savealbum.component'
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';

//RUTAS
const routes:Routes = [
  {path: 'save-band' , component: SavebandComponent},
  {path: 'save-album' , component: SavealbumComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    SavebandComponent,
    SavealbumComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
