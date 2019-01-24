package cl.cepardov.clientesapp.controller;

import cl.cepardov.clientesapp.entity.Cliente;
import cl.cepardov.clientesapp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        cliente.setCreateAt(new Date()); //Tembien se puede implementar en la entity usando @PrePersist
        this.clienteService.save(cliente);
        return cliente;
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente currentCliente = this.clienteService.findById(id);
        currentCliente.setNombre(cliente.getNombre());
        currentCliente.setApellido(cliente.getApellido());
        currentCliente.setEmail(cliente.getEmail());
        this.clienteService.save(currentCliente);
        return currentCliente;
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Cliente currentCliente = this.clienteService.findById(id);
        this.clienteService.delete(currentCliente);
    }

}