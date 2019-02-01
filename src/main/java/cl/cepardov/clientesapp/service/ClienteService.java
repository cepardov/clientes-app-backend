package cl.cepardov.clientesapp.service;

import cl.cepardov.clientesapp.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);
}
