package com.example.EjercicioReservas.Controller;

import com.example.EjercicioReservas.Service.ServicioHabitacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ControllerHabitacion {
    private ServicioHabitacion servicioHabitacion;
    @Autowired
    public ControllerHabitacion(ServicioHabitacion servicioHabitacion) {
        this.servicioHabitacion = servicioHabitacion;
    }



    @PostMapping("/habitaciones")
    public String crearHabitaciones(){
        this.servicioHabitacion.crearHabitaciones();
        return "habitaciones creadas";
    }

}