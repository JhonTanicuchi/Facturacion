package edu.yavirac.facturacionbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.yavirac.facturacionbackend.entity.Categoria;

public interface CategoriaRepository extends CrudRepository <Categoria, Long> {

    List<Categoria> findAll();
    
}
