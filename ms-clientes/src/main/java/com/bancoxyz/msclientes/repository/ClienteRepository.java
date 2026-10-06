package com.bancoxyz.msclientes.repository;

import com.bancoxyz.msclientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByRut(String rut);
}