package edu.yavirac.facturacionbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.yavirac.facturacionbackend.entity.Factura;
import edu.yavirac.facturacionbackend.repository.FacturaRepository;

@Service
public class FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    public Factura save(Factura factura)
    {
        return facturaRepository.save(factura);
    }
    
}
