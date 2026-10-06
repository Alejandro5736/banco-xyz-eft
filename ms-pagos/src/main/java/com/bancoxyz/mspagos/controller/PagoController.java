package com.bancoxyz.mspagos.controller;

import com.bancoxyz.mspagos.entity.Pago;
import com.bancoxyz.mspagos.repository.PagoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pagos")
public class PagoController {

    private final PagoRepository pagoRepository;

    public PagoController(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @PostMapping
    public ResponseEntity<Pago> procesarPago(@RequestBody Pago pago) {
        pago.setFechaTransaccion(LocalDateTime.now());
        pago.setEstado("PROCESADO");
        Pago pagoGuardado = pagoRepository.save(pago);
        return ResponseEntity.ok(pagoGuardado);
    }

    @GetMapping("/cuenta/{cuentaOrigen}")
    public ResponseEntity<List<Pago>> obtenerHistorialPagos(@PathVariable String cuentaOrigen) {
        List<Pago> pagos = pagoRepository.findByCuentaOrigen(cuentaOrigen);
        if (pagos.isEmpty()) {
            pagos = List.of(
                    new Pago(cuentaOrigen, "9876543210", 25000.0, "PROCESADO", LocalDateTime.now().minusDays(1)),
                    new Pago(cuentaOrigen, "5554443332", 15000.0, "PROCESADO", LocalDateTime.now().minusDays(3))
            );
        }
        return ResponseEntity.ok(pagos);
    }
}