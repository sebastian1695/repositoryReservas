package com.example.EjercicioReservas.Dto;

public class HabitacionDTO {
    private Integer numero;
    private String tipo;
    private Integer precioBase;

    public HabitacionDTO(Integer numero, String tipo, Integer precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public HabitacionDTO() {
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }
}
