package com.example.EjercicioReservas.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Habitacion")
public class Habitacion {
    @Id
    @Column (name="numero")
    private Integer numero;

    @Column (name="tipo")
    private String tipo;
    @Column (name ="precioBase")
    private double precioBase;

    public Habitacion() {
    }

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
