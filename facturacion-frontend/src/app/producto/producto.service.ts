import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Producto } from './producto';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { CategoriasConProductos } from '../ventas/tablero/categoriasConProductos';


@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private url: string = environment.API_URL + "/producto";

  private httpOptions = {
    headers : new HttpHeaders({"Content-Type":"application/json"})
  }

  constructor(
    private http: HttpClient
  ) { }

  findByName(termino: string): Observable<Producto[]>
  {
    return this.http.get<Producto[]>(this.url+"/findByName/"+termino, this.httpOptions);
  }

  actualizarCategoriaProducto(productoId: number, categoriaId: number): Observable<Producto>
  {
    console.log("Solicitud al backend"+productoId,", "+categoriaId);
    let producto: Producto = new Producto(productoId, "", 0, categoriaId);
    return this.http.put<Producto>(this.url+"/actualizarCategoria", producto, this.httpOptions);
  }

}
