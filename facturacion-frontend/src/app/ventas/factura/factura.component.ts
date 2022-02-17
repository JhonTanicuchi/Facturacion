import { Component, OnInit } from '@angular/core';
import { Cliente } from 'src/app/cliente/cliente';
import { Producto } from 'src/app/producto/producto';
import { DetalleFactura } from './detalleFactura';
import { Factura } from './factura';
import { FacturaService } from './factura.service';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})
export class FacturaComponent implements OnInit {

  cliente: Cliente = new Cliente(0,"","");

  detallesFactura: DetalleFactura[] = [];
  factura: Factura = new Factura("", new Date, 0, this.detallesFactura);

  constructor(
    private facturaService: FacturaService
  ) { }

  ngOnInit(): void {
  }

  agregarDetalle(producto: Producto): void
  {
    this.detallesFactura.push(new DetalleFactura(producto.productoId, 1, producto.precio, producto.nombre));
  }

  facturar(): void
  {
    this.factura.clienteId = this.cliente.clienteId;
    this.facturaService.save(this.factura).subscribe();
  }

}
