package edu.yavirac.facturacionbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.yavirac.facturacionbackend.entity.Factura;
import edu.yavirac.facturacionbackend.repository.FacturaRepository;
import edu.yavirac.facturacionbackend.service.FacturaService;

@RestController
@RequestMapping("/api/factura/")
@CrossOrigin({"http://localhost:4200"})
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @PostMapping("save")
    private Factura save(@RequestBody Factura factura)
    {
        return facturaService.save(factura);
    }
    
}
