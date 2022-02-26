package edu.yavirac.facturacionbackend.auth.service;

import java.util.List;

import edu.yavirac.facturacionbackend.auth.entity.Permiso;
import edu.yavirac.facturacionbackend.auth.repository.PermisoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermisoService {
    
    @Autowired
    PermisoRepository permisoRepository;

    public Permiso save (Permiso permiso)
    {
        return permisoRepository.save(permiso);
    }

    public List<Permiso> findAll()
    {
        return permisoRepository.findAll();
    }

    public List<Permiso> findByRolId(long rolId)
    {
        return permisoRepository.findByRolId(rolId);
    }
}
