package com.example.EjercicioReservas.Service;

import com.example.EjercicioReservas.Dto.HabitacionDTO;
import com.example.EjercicioReservas.Entity.Habitacion;
import com.example.EjercicioReservas.Repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicioHabitacion {
    private HabitacionRepository habitacionRepository;
    @Autowired
    public ServicioHabitacion(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;


    }
    public void crearHabitaciones(){
        this.habitacionRepository.save(new Habitacion(1,"estandar",10000));
        this.habitacionRepository.save(new Habitacion(2,"estandar",10000));
        this.habitacionRepository.save(new Habitacion(3,"estandar",10000));
        this.habitacionRepository.save(new Habitacion(4,"estandar",10000));
        this.habitacionRepository.save(new Habitacion(5,"estandar",10000));
        this.habitacionRepository.save(new Habitacion(6,"premium",20000));
        this.habitacionRepository.save(new Habitacion(7,"premium",20000));
        this.habitacionRepository.save(new Habitacion(8,"premium",20000));
        this.habitacionRepository.save(new Habitacion(9,"premium",20000));
        this.habitacionRepository.save(new Habitacion(10,"premium",20000));
    }

    }

   // public List<HabitacionDTO> obtenerHabitaciones(){
     //   return this.habitacionRepository.findAll()
       //         .stream()
         //       .map(habitacion -> new HabitacionDTO(
           //             habitacion.getNumero(),
             //           habitacion.getTipo(),
               //         habitacion.getPrecioBase()))
                //.collect(Collectors.toList());

    //}



