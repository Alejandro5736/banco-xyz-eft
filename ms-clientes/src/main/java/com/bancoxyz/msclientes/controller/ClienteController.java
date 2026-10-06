package com.bancoxyz.msclientes.controller;

import com.bancoxyz.msclientes.entity.Cliente;
import com.bancoxyz.msclientes.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Cliente> obtenerClientePorRut(@PathVariable String rut) {
        return clienteRepository.findByRut(rut)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.ok(new Cliente(rut, "Juan Pérez", "juan.perez@bancoxyz.cl", "+56912345678")));
    }
}