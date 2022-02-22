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
import { SortablejsModule } from 'ngx-sortablejs';
import { TableroComponent } from './ventas/tablero/tablero.component';

@NgModule({
  declarations: [
    AppComponent,
    ClienteComponent,
    MenuComponent,
    HomeComponent,
    FacturaComponent,
    ClienteBusquedaComponent,
    ProductoBusquedaComponent,
    TableroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    SortablejsModule.forRoot({ animation: 150 })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
