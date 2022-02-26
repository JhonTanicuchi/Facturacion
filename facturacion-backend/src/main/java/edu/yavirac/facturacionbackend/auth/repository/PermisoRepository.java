package edu.yavirac.facturacionbackend.auth.repository;


import java.util.List;

import edu.yavirac.facturacionbackend.auth.entity.Permiso;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PermisoRepository extends CrudRepository <Permiso, Long> {
    
    List<Permiso> findAll();

    @Query("select p.* from permisos p " +
        "join permisos_roles pr on (p.permiso_id = pr.permiso_id) "+
        "where pr.rol_id =:rolIdpara")
    List<Permiso> findByRolId(@Param("rolIdpara") long rolIdpara);

}
