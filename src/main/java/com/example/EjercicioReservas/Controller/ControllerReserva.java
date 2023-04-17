package com.example.EjercicioReservas.Controller;

import com.example.EjercicioReservas.Dto.ReservaDTO;
import com.example.EjercicioReservas.Entity.Reserva;
import com.example.EjercicioReservas.Service.ServicioReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class ControllerReserva {
    private ServicioReserva service;

    @Autowired

    public ControllerReserva(ServicioReserva service) {
        this.service = service;
    }


    @PostMapping("/cliente/{cedula}/habitacion/{numero}/fecha/{fecha}/reservar")
    public ReservaDTO reservar(@PathVariable("cedula") Integer cedula, @PathVariable("numero") Integer numero, @PathVariable("fecha") String fechaReserva){
        return service.reservar(cedula, numero, fechaReserva);
    }
    @PostMapping ("/cliente/{cedula}/habitacion/{tipo}/consultar")
    public List<Object> consultar (@PathVariable("cedula") Integer cedula, @PathVariable("tipo") String tipo){
        return service.consultar(cedula, tipo);
    }
}
