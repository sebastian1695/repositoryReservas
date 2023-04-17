package com.example.EjercicioReservas.Service;

import com.example.EjercicioReservas.Dto.ClienteDTO;
import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ServicioCliente {
    private ClienteRepository clienteRepository;

    @Autowired
    public ServicioCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente crear(Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    public ClienteDTO crearCliente(ClienteDTO clienteDTO) {
        UUID constrasena = UUID.randomUUID();
        Cliente cliente = new Cliente(clienteDTO.getCedula(),
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getCorreo(),
                clienteDTO.getCedula(),
                constrasena.toString());
        this.clienteRepository.save(cliente);
        return clienteDTO;
    }



    public void crearCliente() {
        this.clienteRepository.save(new Cliente(111,"Sebastián","Rodríguez","Cl2-2",27,"csska@g.com"));
        this.clienteRepository.save(new Cliente(222,"Carlos","Ramírez","Cl2-2",28,"csska@g.com"));
        this.clienteRepository.save(new Cliente(333,"Amadeo","Efron","Cl2-2",29,"csska@g.com"));
        this.clienteRepository.save(new Cliente(444,"Miley","Cyrus","Cl2-2",30,"csska@g.com"));
        this.clienteRepository.save(new Cliente(555,"Dua","Lipa","Cl2-2",31,"csska@g.com"));


    }
}
    //public List<ClienteDTO> obtenerClientes(){
      //  return this.clienteRepository.findAll()
        //        .stream()
          //      .map(cliente -> new ClienteDTO(
            //            cliente.getNombre(),
              //          cliente.getApellido(),
                //        cliente.getCorreo(),
                  //      cliente.getCedula()))
                //.collect(Collectors.toList());
    //}

