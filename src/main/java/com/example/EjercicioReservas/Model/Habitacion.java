package com.example.EjercicioReservas.Model;

public class Habitacion {
    private Integer numero;
    private String tipo;
    private double precioBase;

    public Habitacion(Integer numero, String tipo, double precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
