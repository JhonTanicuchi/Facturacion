package edu.yavirac.facturacionbackend.dto;

import java.util.List;

import edu.yavirac.facturacionbackend.entity.Producto;
import lombok.Data;

@Data
public class CatetoriaConProductosDTO {
    

    private long categoriaId;
    private String nombre;
    List<Producto> productos;

}
