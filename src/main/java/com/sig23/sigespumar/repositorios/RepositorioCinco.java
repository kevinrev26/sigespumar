package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte5;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioCinco extends JpaRepository<Reporte5, Integer>{

    List<Reporte5> findByfechaBetween(Date start, Date end);

}
