package com.example.EjercicioReservas.Controller;

import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Service.ServicioCliente;
import com.example.EjercicioReservas.Service.ServicioReserva;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping ("/api/v1")
@Api (value = "_-----",description="Crud Cliente informacion general ")
public class ControllerCliente {
    private ServicioCliente servicioCliente;

    @Autowired

    public ControllerCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    @ApiResponses(value={
            @ApiResponse( code = 200, message ="cliente creado satisfactoriamente "),
            @ApiResponse( code = 404, message ="cliente no creado"),
            @ApiResponse( code = 500, message ="Servidor no encontrado")



    })
    @PostMapping ("/cliente")
    public Cliente crear(@RequestBody Cliente cliente){

        return servicioCliente.crear(cliente);
    }
    @PostMapping("/clientes")
    public String crearClientes (){
        this.servicioCliente.crearCliente();
        return "clientes creados";
    }


}
