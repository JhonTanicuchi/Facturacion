import { DetalleFactura } from "./detalleFactura";

export class Factura{

  constructor(
    public facturaId: number,
    public nro: string,
    public fecha: Date,
    public clienteId: number,
    public detalleFactura: DetalleFactura[]
  )
  {}

}
