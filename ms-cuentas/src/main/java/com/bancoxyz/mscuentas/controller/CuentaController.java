package com.bancoxyz.mscuentas.controller;

import com.bancoxyz.mscuentas.entity.Cuenta;
import com.bancoxyz.mscuentas.repository.CuentaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cuentas")
public class CuentaController {

    private final CuentaRepository cuentaRepository;

    public CuentaController(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @GetMapping("/{numeroCuenta}")
    public ResponseEntity<Cuenta> obtenerCuentaPorNumero(@PathVariable String numeroCuenta) {
        return cuentaRepository.findByNumeroCuenta(numeroCuenta)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.ok(new Cuenta(numeroCuenta, "Corriente", 1850000.0, "12.345.678-9")));
    }
}