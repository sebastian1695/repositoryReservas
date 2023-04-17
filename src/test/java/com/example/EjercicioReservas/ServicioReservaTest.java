package com.example.EjercicioReservas;

import com.example.EjercicioReservas.Dto.ReservaDTO;
import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Model.Habitacion;
import com.example.EjercicioReservas.Model.Reserva;
import com.example.EjercicioReservas.Repository.ClienteRepository;
import com.example.EjercicioReservas.Repository.HabitacionRepository;
import com.example.EjercicioReservas.Repository.ReservaRepository;
import com.example.EjercicioReservas.Service.ServicioReserva;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

public class ServicioReservaTest {
    ReservaRepository reservaRepository;
     HabitacionRepository habitacionRepository;
     ClienteRepository clienteRepository;
     ServicioReserva servicioReserva;


    @Before
    public void setUp(){

        this.reservaRepository = mock(ReservaRepository.class);
        this.habitacionRepository= mock(HabitacionRepository.class);
        this.clienteRepository = mock(ClienteRepository.class);



         this.servicioReserva = new ServicioReserva(reservaRepository,habitacionRepository,clienteRepository);

     }
     @Test
    public void reservaSinCedula(){
        //Arrange
        Integer cedula = null;
        Integer numero = 1;
        String fechaString = "2023-04-20";
        //Act
        ReservaDTO reserva= this.servicioReserva.reservar(cedula,numero, fechaString);


        //Assert

        assertTrue(reserva==null);

    }
    @Test
    public void reservaSinNumero(){
        //Arrange
        Integer cedula = 111;
        Integer numero = null;
        String fechaString = "2023-04-20";
        //Act
        ReservaDTO reserva= this.servicioReserva.reservar(cedula,numero, fechaString);

        //Assert

        assertTrue(reserva ==null);

    }
    @Test
    public void reservaSinFecha(){
        //Arrange
        Integer cedula = 111;
        Integer numero = 1;
        String fechaString = null;
        //Act
        ReservaDTO reserva= this.servicioReserva.reservar(cedula,numero, fechaString);

        //Assert

        assertTrue(reserva ==null);

    }
    @Test

    public void reservaSinNada(){
        //Arrange
        Integer cedula= null;
        Integer numero = null;
        String fechaString = null;
        //Act
        ReservaDTO reserva = this.servicioReserva.reservar(cedula,numero,fechaString);

        //Assert

        assertTrue(reserva==null);
    }
    @Test
    public void reservaHabitacionEstandar(){
        //Arrange

        Integer cedula = 111;
        Integer numero = 1;
        String fechaString = "2023-04-20";
        //Act

  //      Habitacion habitacion1 = new Habitacion(1,"estandar", 10000);
    //    when(habitacionRepository.findById(any())).thenReturn(Optional.of(habitacion1));



        //Habitacion habitacion2 = new Habitacion(2, "premium", 20000.0);
      //  when(habitacionRepository.findById(any())).thenReturn(Optional.of(habitacion2));

        Cliente cliente = new Cliente(111,"Sebastián", "Rodríguez","cl2#2-2",27, "csebastianrodriguezc@gmail.com" );
        when(clienteRepository.findById(any())).thenReturn(Optional.of(cliente));

        List<Object> disponibles= this.servicioReserva.consultar(cedula, "tipo");

        //Assert
        assertNotNull(disponibles);
    }
    @Test
    public void consultarSinCliente(){

        //Arrange
        Integer cedula = 1234;
        String tipo = "estandar";
        //Act&Assert
        when(clienteRepository.findById(any())).thenReturn(Optional.empty());
        List<Object> disponibles = this.servicioReserva.consultar(cedula, tipo);




    }





     @Test
    public void probarSumaConPrimerNumeroNegativo(){
         //Arrange
        Integer numero1 =-1;
        Integer numero2 =2;

        //Act
         Integer suma =this.servicioReserva.sumar(numero1, numero2);

        //Assert
         assertTrue(suma==0);
    }
    @Test
    public void probarSumaConSegundoNumeroNegativo(){
        //Arrange
        Integer numero1 =1;
        Integer numero2 =-2;

        //Act
        Integer suma =this.servicioReserva.sumar(numero1, numero2);

        //Assert
        assertTrue(suma==0);
    }
    @Test
    public void probarSumaConNumerosNegativos(){
        //Arrange
        Integer numero1 =-1;
        Integer numero2 =-2;

        //Act
        Integer suma =this.servicioReserva.sumar(numero1, numero2);

        //Assert
        assertTrue(suma==0);
    }

    @Test
    public void sumaExitosa(){
        //Arrange
        Integer numero1 =1;
        Integer numero2 =2;

        //Act
        Integer suma =this.servicioReserva.sumar(numero1, numero2);

        //Assert
        assertTrue(suma==3);
    }





}
