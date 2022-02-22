package edu.yavirac.facturacionbackend.service;

import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.yavirac.facturacionbackend.entity.Producto;
import edu.yavirac.facturacionbackend.repository.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> findByName(String termino)
    {
        return productoRepository.findByNombreLikeIgnoreCase(termino);
    }

    public List<Producto> findAll()
    {
        return productoRepository.findAll();
    }

    public List<Producto> findByCategoriaId(long id)
    {
        return productoRepository.findByCategoriaId(id);
    }

    public Producto actualizarCategoria(Producto producto)
    {
        Producto productoEnBaseDeDatos = productoRepository.findById(producto.getProductoId()).get();
        productoEnBaseDeDatos.setCategoriaId(producto.getCategoriaId());
        return productoRepository.save(productoEnBaseDeDatos);
    }
}
