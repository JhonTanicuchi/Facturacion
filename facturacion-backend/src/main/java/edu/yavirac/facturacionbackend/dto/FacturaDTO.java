package edu.yavirac.facturacionbackend.dto;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("v_factura")
public class FacturaDTO {

    @Id
    @Column("factura_id")
    private long facturaId;

    private String nro;
    private Timestamp fecha;
    @Column("nombre_cliente")
    private String nombreCliente;
    private String identificacion;
    @Column("nombre_producto")
    private String nombreProducto;
    private Double cantidad;
    private Double precio;
    private Double subtotal;
    
}
