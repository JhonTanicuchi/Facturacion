package edu.yavirac.facturacionbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.yavirac.facturacionbackend.entity.Producto;
import edu.yavirac.facturacionbackend.service.ProductoService;

@RestController
@CrossOrigin({"http://localhost:4200"})
@RequestMapping("api/producto")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @PreAuthorize("hasAuthority('PRODUCTO_LEER')")
    @GetMapping("/findByName/{termino}")
    public List<Producto> findByName(@PathVariable String termino)
    {
        return productoService.findByName("%"+termino+"%");
    }

    @PreAuthorize("hasAuthority('PRODUCTO_ACTUALIZAR')")
    @PutMapping("/actualizarCategoria")
    public Producto actualizarCategoria(@RequestBody Producto producto)
    {
        System.out.println("Atendiendo solicitud de actualizacion:"+ producto.getProductoId());
        return productoService.actualizarCategoria(producto);
    }

}
