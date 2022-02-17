export class DetalleFactura {

  constructor(
    public productoId: number,
    public cantidad: number,
    public precio: number,
    public nombreProducto: string
  )
  {}
}
