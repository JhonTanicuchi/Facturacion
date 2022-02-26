package edu.yavirac.facturacionbackend.auth.repository;

import java.util.List;

import edu.yavirac.facturacionbackend.auth.entity.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    
    List<Usuario> findAll();

    Usuario findByUsername(String username);
}
