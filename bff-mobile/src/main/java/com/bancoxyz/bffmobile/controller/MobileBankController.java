package com.bancoxyz.bffmobile.controller;

import com.bancoxyz.bffmobile.dto.MobileResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mobile")
public class MobileBankController {

    @GetMapping("/cuentas/{numeroCuenta}")
    public ResponseEntity<MobileResponseDTO> obtenerResumenMobile(@PathVariable String numeroCuenta) {
        MobileResponseDTO dto = new MobileResponseDTO(numeroCuenta, 1850000.0, "Ahorro");
        return ResponseEntity.ok(dto);
    }
}