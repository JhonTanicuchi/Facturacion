import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ClienteComponent } from './cliente/cliente.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { FacturaComponent } from './ventas/factura/factura.component';
import { ClienteBusquedaComponent } from './cliente/cliente-busqueda/cliente-busqueda.component';
import { ProductoBusquedaComponent } from './producto/producto-busqueda/producto-busqueda.component';

@NgModule({
  declarations: [
    AppComponent,
    ClienteComponent,
    MenuComponent,
    HomeComponent,
    FacturaComponent,
    ClienteBusquedaComponent,
    ProductoBusquedaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
