package edu.yavirac.facturacionbackend.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permisos")
public class Permiso {
    
    @Id
    @Column("permiso_id")
    private long permisoId;
    private String nombre;
}
