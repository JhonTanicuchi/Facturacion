package edu.yavirac.facturacionbackend.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.yavirac.facturacionbackend.entity.Categoria;
import edu.yavirac.facturacionbackend.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    CategoriaRepository categoriaRepository;


    public List<Categoria> findAll()
    {
        return categoriaRepository.findAll();
    }
}
