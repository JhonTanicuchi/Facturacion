import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Factura } from './factura';

@Injectable({
  providedIn: 'root'
})
export class FacturaService {

  private url: string = environment.API_URL + "/factura";

  private httpOptions = {
    headers : new HttpHeaders({"Content-Type":"application/json"})
  }

  constructor(
    private http: HttpClient
  ) { }

  save(factura: Factura): Observable<Factura>
  {
    return this.http.post<Factura>(this.url+"/save", factura, this.httpOptions);
  }

  getPdf(id: number): Observable<Blob>
  {
    let headers = new HttpHeaders();
    headers = headers.set("Accept","application/pdf");
    return this.http.get<Blob>(this.url+"/facturaPDF/"+id,{ headers: headers, responseType: 'blob' as 'json' })

  }

}
