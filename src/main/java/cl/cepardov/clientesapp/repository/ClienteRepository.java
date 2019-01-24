package cl.cepardov.clientesapp.repository;

import cl.cepardov.clientesapp.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
