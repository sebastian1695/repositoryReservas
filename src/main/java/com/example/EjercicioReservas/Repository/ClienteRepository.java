package com.example.EjercicioReservas.Repository;

import com.example.EjercicioReservas.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
}
