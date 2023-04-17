package com.example.EjercicioReservas.Repository;

import com.example.EjercicioReservas.Entity.Habitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends CrudRepository <Habitacion, Integer>{

}
