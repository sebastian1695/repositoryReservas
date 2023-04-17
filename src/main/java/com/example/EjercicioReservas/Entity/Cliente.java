package com.example.EjercicioReservas.Entity;
import java.lang.reflect.InvocationTargetException;

import com.example.EjercicioReservas.Entity.Reserva;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="cliente")

public class Cliente {
    @Id
    @Column( name ="cedula")
    private  Integer cedula;
    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column( name ="direccion")
    private String direccion;
    @Column(name= "edad")
    private Integer edad;
    @Column (name="correo")
    private String correo;

    @OneToMany (mappedBy = "cliente",cascade= CascadeType.ALL)
    private List<Reserva> reservas;


    public Cliente() {
    }

    public Cliente(Integer cedula, String nombre, String apellido, String direccion, Integer  edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

