package com.bancoxyz.bffatm.controller;

import com.bancoxyz.bffatm.dto.AtmResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/atm")
public class AtmBankController {

    @GetMapping("/cuentas/{numeroCuenta}")
    public ResponseEntity<AtmResponseDTO> obtenerResumenAtm(@PathVariable String numeroCuenta) {
        AtmResponseDTO dto = new AtmResponseDTO(
                numeroCuenta,
                1850000.0,
                200000.0,
                "ACTIVA"
        );
        return ResponseEntity.ok(dto);
    }
}