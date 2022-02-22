import { Component, OnInit } from '@angular/core';
import { Options } from 'sortablejs';
import { CategoriasConProductos } from './categoriasConProductos';
import { TableroService } from './tablero.service';
import { ProductoService  } from 'src/app/producto/producto.service';
import { HttpClient, HttpXhrBackend } from '@angular/common/http';

@Component({
  selector: 'app-tablero',
  templateUrl: './tablero.component.html'
})
export class TableroComponent implements OnInit {

  categoriasConProductos: CategoriasConProductos[] = [];

  constructor(
    private tableroService: TableroService
  ) { }

  ngOnInit(): void {
    this.getCategoriasConProductos();
  }

  getCategoriasConProductos(): void
  {
    this.tableroService.getCategoriasConProductos().subscribe(
      (todasLasCategoriasConProductos) => {
        this.categoriasConProductos = todasLasCategoriasConProductos
      }
    );

  }

  options: Options = {
    group: 'tablero',
    onAdd: function (/**Event*/evt) {
      var itemEl = evt.item;
      let productoId = itemEl.id;
      let categoriaId = evt.to.id;

      const httpClient = new HttpClient(new HttpXhrBackend({
        build: () => new XMLHttpRequest()
      }));

      let productoService: ProductoService = new ProductoService(httpClient);

      productoService.actualizarCategoriaProducto(parseInt(productoId), parseInt(categoriaId))
      .subscribe();
    },
  };

}
