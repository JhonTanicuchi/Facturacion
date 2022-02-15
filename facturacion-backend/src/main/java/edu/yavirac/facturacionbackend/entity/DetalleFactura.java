package edu.yavirac.facturacionbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("facturacion\".\"detalles_factura")
public class DetalleFactura {

    @Id
    @Column("detalle_factura_id")
    private long detalleFacturaId;

    @Column("factura_id")
    private long facturaId;

    @Column("producto_id")
    private long productoId;

    private Double cantidad;
    private Double precio;

}
