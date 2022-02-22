import { HttpClient, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CategoriasConProductos } from './categoriasConProductos';

@Injectable({
  providedIn: 'root'
})
export class TableroService {

  private url = environment.API_URL + "/categoria";

  private httpOptions = {
    headers:  new HttpHeaders({"Content-Type":"application/json"})
  }

  constructor(
    private http: HttpClient
  ) { }

  public getCategoriasConProductos(): Observable<CategoriasConProductos[]>
  {
    console.log("Ingresando en servicio")
    return this.http.get<CategoriasConProductos[]>(this.url+"/categoriasConProductos", this.httpOptions);
  }
}
