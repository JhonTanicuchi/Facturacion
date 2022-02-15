import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  desplegado: boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  desplegar():void
  {
    if (window.innerWidth>640)
      return;

    this.desplegado = !this.desplegado;
    console.log(this.desplegado);
  }

  getDesplegadoClass():string
  {

    if (this.desplegado)
      return "w-full flex flex-col md:flex-row md:w-auto";
    else
      return "w-full hidden md:flex md:w-auto";
  }

}
