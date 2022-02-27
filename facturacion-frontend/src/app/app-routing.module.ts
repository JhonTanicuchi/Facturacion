import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClienteComponent } from './cliente/cliente.component';
import { HomeComponent } from './home/home.component';
import { AlertaComponent } from './login/alerta/alerta/alerta.component';
import { LoginComponent } from './login/login.component';
import { FacturaComponent } from './ventas/factura/factura.component';
import { TableroComponent } from './ventas/tablero/tablero.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full' },
  {path: 'cliente', component: ClienteComponent},
  {path: 'home', component: HomeComponent},
  {path: 'factura', component: FacturaComponent},
  {path: 'tablero', component: TableroComponent},
  {path: 'login', component: LoginComponent},
  {path: 'alerta', component: AlertaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
