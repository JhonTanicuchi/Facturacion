package edu.yavirac.facturacionbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.yavirac.facturacionbackend.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findAll();

    List<Cliente> findByNombreLikeIgnoreCase(String termino);
    
}
