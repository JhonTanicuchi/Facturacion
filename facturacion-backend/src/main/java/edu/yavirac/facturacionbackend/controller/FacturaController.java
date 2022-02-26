package edu.yavirac.facturacionbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.yavirac.facturacionbackend.entity.Factura;
import edu.yavirac.facturacionbackend.repository.FacturaRepository;
import edu.yavirac.facturacionbackend.service.FacturaService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@RestController
@RequestMapping("/api/factura/")
@CrossOrigin({"http://localhost:4200"})
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @PreAuthorize("hasAuthority('FACTURA_CREAR')")
    @PostMapping("save")
    private Factura save(@RequestBody Factura factura)
    {
        return facturaService.save(factura);
    }

    @PreAuthorize("hasAuthority('FACTURA_PDF')")
    @GetMapping("facturaPDF/{id}")
    public ResponseEntity<byte[]> getPdf(@PathVariable long id) throws JRException
    {
        JasperPrint reporte = facturaService.getPdf(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "factura.pdf");
        
        
        return new ResponseEntity<byte[]>(JasperExportManager.exportReportToPdf(reporte), headers, HttpStatus.OK);

    }

    
}
