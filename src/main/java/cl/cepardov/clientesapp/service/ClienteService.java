package cl.cepardov.clientesapp.service;

import cl.cepardov.clientesapp.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();

    void save(Cliente cliente);

    Cliente findById(Long id);

    void delete(Cliente cliente);
}
