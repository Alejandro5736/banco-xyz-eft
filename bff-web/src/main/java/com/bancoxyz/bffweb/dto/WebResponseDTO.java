package com.bancoxyz.bffweb.dto;

import java.util.List;

public class WebResponseDTO {

    private String numeroCuenta;
    private Double saldo;
    private String tipoCuenta;
    private String nombreTitular;
    private String rutTitular;
    private List<String> ultimosMovimientos;

    public WebResponseDTO() {}

    public WebResponseDTO(String numeroCuenta, Double saldo, String tipoCuenta, String nombreTitular, String rutTitular, List<String> ultimosMovimientos) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.nombreTitular = nombreTitular;
        this.rutTitular = rutTitular;
        this.ultimosMovimientos = ultimosMovimientos;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getRutTitular() {
        return rutTitular;
    }

    public void setRutTitular(String rutTitular) {
        this.rutTitular = rutTitular;
    }

    public List<String> getUltimosMovimientos() {
        return ultimosMovimientos;
    }

    public void setUltimosMovimientos(List<String> ultimosMovimientos) {
        this.ultimosMovimientos = ultimosMovimientos;
    }
}