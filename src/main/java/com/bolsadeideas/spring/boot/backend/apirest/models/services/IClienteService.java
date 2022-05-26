package com.bolsadeideas.spring.boot.backend.apirest.models.services;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
