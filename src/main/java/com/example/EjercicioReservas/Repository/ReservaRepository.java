package com.example.EjercicioReservas.Repository;

import com.example.EjercicioReservas.Entity.Cliente;
import com.example.EjercicioReservas.Entity.Habitacion;
import com.example.EjercicioReservas.Entity.Reserva;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {

    @Query(value= "SELECT count(*) FROM RESERVA where habitacion=:numero and fecha=:fecha", nativeQuery = true)
    public Integer disponibilidadQuery(@Param("numero") Integer numero, @Param("fecha") Date fecha);

    @Query(value = "select h from habitacion h left join reserva  r on h.numero_h = r.habitacion where r.habitacion is null and tipo=:tipo", nativeQuery = true)
    public List<Object> disponibilidadPorTipo(@Param("tipo") String tipo);
}

  ///* @Query(value = "Select h from Habitacion h, Reserva r Where h.numero not in (SELECT Habitacion.numero from Reserva)" +
    //    "OR h.numero not in (SELECT DISTINCT r.Habitacion.numero from Reserva r where r.fechaReserva=?1")
    //List<Cliente> search (String Reserva);/*
  //@Query("Select  h FROM Habitacion h, Reserva r WHERE h.numero not in(SELECT habitacion.numero from Reserva) " +
  //        "OR h.numero not in(select distinct r.habitacion.numero from  Reserva r where r.fechaReserva= ?1)")
//  public List<Habitacion> findByDate(String fecha);

//@Query("SELECT r FROM Reserva r WHERE r.cliente.cedula = ?1")
//public List<Reserva> findAllById(Long keyword);
//@Query("Select  h FROM Habitacion h, Reserva r WHERE h.numero not in(SELECT habitacion.numero from Reserva) " +
  //      "OR h.numero not in(select distinct r.habitacion.numero from  Reserva r where r.fechaReserva= ?1)")
//public List<Habitacion> findByDate(String fecha);
//@Query("Select  h FROM Habitacion h, Reserva r WHERE (h.numero not in(SELECT habitacion.numero from Reserva) " +
  //      "OR h.numero not in(select distinct r.habitacion.numero from  Reserva r where r.fechaReserva= ?1)) AND h.tipoHabitacion=?2")
//public List<Habitacion> findByDateType(String fecha, String tipo);
//@Query("Select h.numero FROM Habitacion h, Reserva r WHERE h.numero not in(SELECT habitacion.numero from Reserva) " +
  //      "OR h.numero not in(select distinct r.habitacion.numero from  Reserva r where r.fechaReserva= ?1)")
//public List<Integer> getAvailability(String fecha);



















