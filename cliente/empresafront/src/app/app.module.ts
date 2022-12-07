import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListadepartamentosComponent } from './components/listadepartamentos/listadepartamentos.component';
import { RouterModule, Routes} from '@angular/router'
import { HttpClientModule } from '@angular/common/http';
import { DepartamentoformComponent } from './components/departamentoform/departamentoform.component'
import { FormsModule } from '@angular/forms';

const rutas:Routes = [
  {path:'departamentos', component: ListadepartamentosComponent},
  {path:'departamento/form', component: DepartamentoformComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    ListadepartamentosComponent,
    DepartamentoformComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(rutas),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
