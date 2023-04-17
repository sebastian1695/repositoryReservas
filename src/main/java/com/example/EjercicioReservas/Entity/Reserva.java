package com.example.EjercicioReservas.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="Reserva")
public class Reserva {
    @Column (name ="fecha")
    private Date fecha;
    @OneToOne
    @JoinColumn (name = "habitacion")
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn (name = "cedula")
    private Cliente cliente;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name ="total")
    private Double total;

    public Reserva() {
    }

    public Reserva(Date fecha, Double total, Cliente cliente, Habitacion habitacion) {
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.cliente = cliente;
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
