package edu.yavirac.facturacionbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.yavirac.facturacionbackend.entity.Producto;


public interface ProductoRepository  extends CrudRepository <Producto, Long>{
    
    List<Producto> findByNombreLikeIgnoreCase(String terminio);
}
