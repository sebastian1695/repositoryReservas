package com.example.EjercicioReservas;

import com.example.EjercicioReservas.Dto.ClienteDTO;
import com.example.EjercicioReservas.Repository.ClienteRepository;
import com.example.EjercicioReservas.Service.ServicioCliente;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;

public class ServicioClienteTest {
    ClienteRepository clienteRepository;
    ServicioCliente servicioCliente;

    @Before
    public void setUp(){
        this.clienteRepository = mock(ClienteRepository.class);
        this.servicioCliente = new ServicioCliente(clienteRepository);
    }

    @Test (expected = RuntimeException.class)
    public void clienteCedulaNula(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(null,"Sebastián", "Rodríguez", "cl2#2-2",27, "csebastianrodriguezc@gmail.com");
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getCedula().equals(111));

    }
    @Test (expected = RuntimeException.class)
    public void clienteNombreNulo(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(111,null, "Rodríguez", "cl2#2-2",27, "csebastianrodriguezc@gmail.com");
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getNombre().equals("Sebastian"));

    }
    @Test (expected = RuntimeException.class)
    public void clienteApellidoNulo(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(111,"Sebastián", null, "cl2#2-2",27, "csebastianrodriguezc@gmail.com");
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getApellido().equals("Rodriguez"));

    }
    @Test (expected = RuntimeException.class)
    public void clienteDireccionNula(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(111,"Sebastián", "Rodríguez", null,27, "csebastianrodriguezc@gmail.com");
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getDireccion().equals("cl2#2-2"));

    }
    @Test (expected = RuntimeException.class)
    public void clienteEdadNula(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(111,"Sebastián", "Rodríguez", "cl2#2-2",null, "csebastianrodriguezc@gmail.com");
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getEdad().equals(27));

    }
    @Test (expected = RuntimeException.class)
    public void clienteCorreoNulo(){
        //Arrange
        ClienteDTO cliente =new ClienteDTO(null,"Sebastián", "Rodríguez", "cl2#2-2",27, null);
        //Act
        servicioCliente.crearCliente(cliente);
        //Assert
        assertTrue(cliente.getCorreo().equals("csebastianrodriguezc@gmail.com"));

    }




}
