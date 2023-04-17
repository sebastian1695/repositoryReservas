package com.example.EjercicioReservas.Dto;

import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Entity.Habitacion;

import java.util.Date;

public class ReservaDTO {
    private Date fecha;
    private Habitacion habitacion;
    //private Cliente cliente;
    private Integer codigo;
    private Double total;

    public ReservaDTO(Date fecha, Habitacion habitacion, Integer codigo, Double total) {
        this.fecha = fecha;
        this.habitacion = habitacion;
       // this.cliente = cliente;
        this.codigo = codigo;
        this.total = total;
    }

    public ReservaDTO() {
    }

    public Date getFecha() {
        return fecha;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

  //  public Cliente getCliente() {
    //    return cliente;
    //}

    public Integer getCodigo() {
        return codigo;
    }
    public  Double getTotal(){
        return total;
    }
}
