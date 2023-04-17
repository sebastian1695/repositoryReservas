package com.example.EjercicioReservas.Model;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private Habitacion habitacion;
    private Cliente cliente;
    private Integer codigo;
    private Double total;

    public Reserva(Date fecha, Habitacion habitacion, Cliente cliente, Integer codigo, Double total) {
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.codigo = codigo;
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getTotal() {
        return total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
