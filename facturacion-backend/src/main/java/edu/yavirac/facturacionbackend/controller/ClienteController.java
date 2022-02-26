package edu.yavirac.facturacionbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.yavirac.facturacionbackend.entity.Cliente;
import edu.yavirac.facturacionbackend.service.ClienteService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin({"http://localhost:4200"})
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    //Create
    @PreAuthorize("hasAuthority('CLIENTE_CREAR')")
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente)
    {
        return clienteService.save(cliente);
    }

    //Read
    @PreAuthorize("hasAuthority('CLIENTE_LEER')")
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id)
    {
        return clienteService.findById(id);
    }
    //Update
    @PreAuthorize("hasAuthority('CLIENTE_ACTUALIZAR')")
    @PutMapping("/update")
    public Cliente update(@RequestBody Cliente cliente)
    {
        return clienteService.save(cliente);
    }
    
    //Delete
    @PreAuthorize("hasAuthority('CLIENTE_ELIMINAR')")
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id)
    {
        clienteService.deleteById(id);
    }


    @GetMapping("/findAll")
    public List<Cliente> findAll()
    {
        return clienteService.findAll();
    }

    @GetMapping("/findByName/{termino}")
    public List<Cliente> findByName(@PathVariable String termino) {
        return clienteService.findByName(termino+"%");
    }
    
    
}
