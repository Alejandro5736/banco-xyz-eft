package com.bancoxyz.bffweb.controller;

import com.bancoxyz.bffweb.dto.WebResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web")
public class WebBankController {

    @GetMapping("/cuentas/{numeroCuenta}")
    public ResponseEntity<WebResponseDTO> obtenerDetalleWeb(@PathVariable String numeroCuenta) {
        WebResponseDTO dto = new WebResponseDTO(
                numeroCuenta,
                1850000.0,
                "Ahorro",
                "Juan Pérez",
                "12.345.678-9",
                List.of("Transferencia recibida: +$100.000", "Pago de servicio: -$25.000", "Giro cajero: -$50.000")
        );
        return ResponseEntity.ok(dto);
    }
}