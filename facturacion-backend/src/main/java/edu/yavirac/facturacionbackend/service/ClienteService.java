package edu.yavirac.facturacionbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.yavirac.facturacionbackend.entity.Cliente;
import edu.yavirac.facturacionbackend.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    //Create y Update
    public Cliente save(Cliente cliente)
    {
      return clienteRepository.save(cliente);
    }
    //Read
    public Cliente findById(Long id)
    {
        return clienteRepository.findById(id).get();
    }

    //Delete
    public void deleteById(Long id)
    {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> findAll()
    {
        return clienteRepository.findAll();
    }
    
}
