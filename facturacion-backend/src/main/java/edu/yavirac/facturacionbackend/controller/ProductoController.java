package edu.yavirac.facturacionbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/findByName/{termino}")
    public List<Producto> findByName(@PathVariable String termino)
    {
        return productoService.findByName("%"+termino+"%");
    }

}
