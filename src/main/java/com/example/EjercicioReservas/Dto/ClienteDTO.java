package com.example.EjercicioReservas.Dto;

public class ClienteDTO {
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;
    private  String correo;

    public ClienteDTO(Integer cedula, String nombre, String apellido, String direccion, Integer edad, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
    }

    public ClienteDTO() {
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

}
