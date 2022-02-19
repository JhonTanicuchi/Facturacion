package edu.yavirac.facturacionbackend.service;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import edu.yavirac.facturacionbackend.dto.FacturaDTO;
import edu.yavirac.facturacionbackend.entity.Factura;
import edu.yavirac.facturacionbackend.repository.FacturaDTORepository;
import edu.yavirac.facturacionbackend.repository.FacturaRepository;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class FacturaService {

    @Autowired
    FacturaRepository facturaRepository;
    @Autowired
    FacturaDTORepository facturaDTORepository;

    public Factura save(Factura factura)
    {
        return facturaRepository.save(factura);
    }

    public JasperPrint getPdf(long facturaId)
    {
        List<FacturaDTO> datosFactura =  facturaDTORepository.findByFacturaId(facturaId);
        if (datosFactura.isEmpty())
            return null;

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("nro", datosFactura.get(0).getNro());
        parametros.put("fecha", datosFactura.get(0).getFecha());
        parametros.put("nombreCliente", datosFactura.get(0).getNombreCliente());
        parametros.put("identificacion", datosFactura.get(0).getIdentificacion());
        parametros.put("facturaDetalle", new JRBeanCollectionDataSource(datosFactura));

        JasperPrint reporte = null;

        try {
            reporte = JasperFillManager.fillReport(
                JasperCompileManager.compileReport(ResourceUtils.getFile("classpath:reportes/factura.jrxml").getAbsolutePath()),
                    parametros,
                    new JREmptyDataSource()
                );
        } catch (FileNotFoundException | JRException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return reporte;

    }

   
    
}
