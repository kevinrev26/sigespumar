package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte1;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by kevin on 06-29-17.
 */
public interface RepositorioUno extends JpaRepository<Reporte1, String> {
    List<Reporte1> findByfechaOrdenBetween(Date start, Date end);
}
