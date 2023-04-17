package com.example.EjercicioReservas.Service;
import com.example.EjercicioReservas.Dto.ReservaDTO;
import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Entity.Habitacion;
import com.example.EjercicioReservas.Entity.Reserva;
import com.example.EjercicioReservas.Repository.ClienteRepository;
import com.example.EjercicioReservas.Repository.HabitacionRepository;
import com.example.EjercicioReservas.Repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServicioReserva {
    private ReservaRepository reservaRepository;
    private HabitacionRepository habitacionRepository;
    private ClienteRepository clienteRepository;

    @Autowired

    public ServicioReserva(ReservaRepository reservaRepository, HabitacionRepository habitacionRepository, ClienteRepository clienteRepository) {
        this.reservaRepository = reservaRepository;
        this.habitacionRepository = habitacionRepository;
        this.clienteRepository = clienteRepository;
    }


    public ReservaDTO reservar(Integer cedula, Integer numero, String fechaString) {
        if(cedula==null || numero ==null || fechaString==null){
            throw new RuntimeException("Reserva no válida");
        }
        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        Optional<Habitacion> habitacion = this.habitacionRepository.findById(numero);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = sdf.parse(fechaString);
            System.out.println("Fecha parseada:" + fecha);


            if (cliente.isPresent() && habitacion.get().getTipo().equals("premium") && disponibilidad(fecha, numero)) {
                Double precioBase = habitacion.get().getPrecioBase();
                Double total = precioBase - (precioBase * 0.05);

                Reserva reserva = new Reserva(fecha, total, cliente.get(), habitacion.get());
                this.reservaRepository.save(reserva);

                 ReservaDTO reservaDTO =new ReservaDTO(reserva.getFecha(),
                         reserva.getHabitacion(),
                        // reserva.getCliente(),
                         reserva.getCodigo(),
                         reserva.getTotal());

                    return reservaDTO;

            } else if (cliente.isPresent() && habitacion.get().getTipo().equals("estandar") && disponibilidad(fecha, numero)) {
                Reserva reserva = new Reserva(fecha, habitacion.get().getPrecioBase(), cliente.get(), habitacion.get());
                 this.reservaRepository.save(reserva);

                ReservaDTO reservaDTO =new ReservaDTO(reserva.getFecha(),
                        reserva.getHabitacion(),
                       // reserva.getCliente(),
                        reserva.getCodigo(),
                        reserva.getTotal());

                return reservaDTO;
            }
        }catch (ParseException e){
            e.printStackTrace();
            }
        return null;
            }

    public Boolean disponibilidad(Date fecha, Integer numero){
        Integer resultado = this.reservaRepository.disponibilidadQuery(numero, fecha);

        Date fechaActual = new Date();
        if(  fecha.compareTo(fechaActual)  > 0 && resultado==0) {
            return true;
        }
        return false;

    }
    public List<Object> consultar(Integer cedula, String tipo) {

        Cliente cliente = this.clienteRepository.findById(cedula)
                .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));

        return null;
    }

    public Integer sumar(Integer numero1, Integer numero2){
       if (numero1<=0 || numero2 <=0){
           return 0;
       }
        return numero1+numero2;

    }
    }







