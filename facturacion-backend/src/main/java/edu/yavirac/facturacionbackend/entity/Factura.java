package edu.yavirac.facturacionbackend.entity;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("facturacion\".\"facturas")
public class Factura {

    @Id
    @Column("factura_id")
    private long facturaId;

    private String nro;

    private Timestamp fecha;

    @Column("cliente_id")
    private long clienteId;

    private String observacion;

    @MappedCollection(idColumn = "factura_id")
    Set<DetalleFactura> detalleFactura = new HashSet<>();

    
}
