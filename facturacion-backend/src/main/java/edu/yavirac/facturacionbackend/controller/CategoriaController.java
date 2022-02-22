package edu.yavirac.facturacionbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.yavirac.facturacionbackend.dto.CatetoriaConProductosDTO;
import edu.yavirac.facturacionbackend.entity.Categoria;
import edu.yavirac.facturacionbackend.entity.Producto;
import edu.yavirac.facturacionbackend.service.CategoriaService;
import edu.yavirac.facturacionbackend.service.ProductoService;

@RestController
@CrossOrigin({"http://localhost:4200"})
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;
    @Autowired
    ProductoService productoService;

    @GetMapping("/categoriasConProductos")
    public List<CatetoriaConProductosDTO> gCategoriaConProductosDTOs()
    {
       
        List<CatetoriaConProductosDTO> categoriasConProductosDTOs = new ArrayList<>();
        
        List<Categoria> categorias = categoriaService.findAll();

        

        for (Categoria categoriaActual : categorias)
        {
            CatetoriaConProductosDTO categoriaConProducto = new CatetoriaConProductosDTO();
            categoriaConProducto.setNombre(categoriaActual.getNombre());
            categoriaConProducto.setCategoriaId(categoriaActual.getCategoriaId());
            categoriaConProducto.setProductos(productoService.findByCategoriaId(categoriaActual.getCategoriaId()));
            categoriasConProductosDTOs.add(categoriaConProducto);
        }
        

        return categoriasConProductosDTOs;

    }
    
}
