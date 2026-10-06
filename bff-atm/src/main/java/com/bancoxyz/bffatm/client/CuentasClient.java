package com.bancoxyz.bffatm.client;

import com.bancoxyz.bffatm.dto.AtmResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-cuentas")
public interface CuentasClient {

    @GetMapping("/api/v1/cuentas/{numeroCuenta}")
    AtmResponseDTO obtenerResumenCuentaAtm(@PathVariable("numeroCuenta") String numeroCuenta);
}