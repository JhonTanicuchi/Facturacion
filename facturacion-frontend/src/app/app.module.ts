import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ClienteComponent } from './cliente/cliente.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { FacturaComponent } from './ventas/factura/factura.component';
import { ClienteBusquedaComponent } from './cliente/cliente-busqueda/cliente-busqueda.component';
import { ProductoBusquedaComponent } from './producto/producto-busqueda/producto-busqueda.component';
import { SortablejsModule } from 'ngx-sortablejs';
import { TableroComponent } from './ventas/tablero/tablero.component';
import { LoginComponent } from './login/login.component';
import { TokenInterceptor } from './login/token.interceptor';
import { RespuestaBackendInterceptor } from './login/respuesta-backend.interceptor';
import { AlertaComponent } from './login/alerta/alerta/alerta.component';

@NgModule({
  declarations: [
    AppComponent,
    ClienteComponent,
    MenuComponent,
    HomeComponent,
    FacturaComponent,
    ClienteBusquedaComponent,
    ProductoBusquedaComponent,
    TableroComponent,
    LoginComponent,
    AlertaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    SortablejsModule.forRoot({ animation: 150 })
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: TokenInterceptor,
      multi: true
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: RespuestaBackendInterceptor,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
