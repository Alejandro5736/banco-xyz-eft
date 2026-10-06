package com.bancoxyz.bffatm.dto;

public class AtmResponseDTO {

    private String numeroCuenta;
    private Double saldoDisponible;
    private Double limiteGiroDiario;
    private String estadoTarjeta;

    public AtmResponseDTO() {}

    public AtmResponseDTO(String numeroCuenta, Double saldoDisponible, Double limiteGiroDiario, String estadoTarjeta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
        this.limiteGiroDiario = limiteGiroDiario;
        this.estadoTarjeta = estadoTarjeta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Double getLimiteGiroDiario() {
        return limiteGiroDiario;
    }

    public void setLimiteGiroDiario(Double limiteGiroDiario) {
        this.limiteGiroDiario = limiteGiroDiario;
    }

    public String getEstadoTarjeta() {
        return estadoTarjeta;
    }

    public void setEstadoTarjeta(String estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }
}