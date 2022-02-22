import { Producto } from "src/app/producto/producto";

export class CategoriasConProductos {
  constructor(
    public categoriaId: number,
    public nombre: string,
    public productos: Producto[]
  )
  {}
}
