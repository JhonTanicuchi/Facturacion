package edu.yavirac.facturacionbackend.repository;

import org.springframework.data.repository.CrudRepository;

import edu.yavirac.facturacionbackend.entity.Factura;

public interface FacturaRepository extends CrudRepository <Factura, Long> {
    
}
