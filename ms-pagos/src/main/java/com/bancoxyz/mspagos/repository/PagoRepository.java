package com.bancoxyz.mspagos.repository;

import com.bancoxyz.mspagos.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByCuentaOrigen(String cuentaOrigen);
}