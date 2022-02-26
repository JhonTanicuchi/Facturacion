package edu.yavirac.facturacionbackend.auth.repository;


import java.util.List;

import edu.yavirac.facturacionbackend.auth.entity.Rol;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository <Rol, Long> {
    
    List<Rol> findAll();
}
