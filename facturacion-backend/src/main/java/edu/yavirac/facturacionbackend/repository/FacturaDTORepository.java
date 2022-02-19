package edu.yavirac.facturacionbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.yavirac.facturacionbackend.dto.FacturaDTO;

public interface FacturaDTORepository  extends CrudRepository <FacturaDTO, Long>{

    List<FacturaDTO> findByFacturaId(long id);
    
}
