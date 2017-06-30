package com.sig23.sigespumar.repositorios;

import com.sig23.sigespumar.modelos.Reporte11;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by kevin on 06-30-17.
 */
public interface RepositorioOnce extends JpaRepository<Reporte11, Long>{

    List<Reporte11> findByfechaBetween(Date start, Date end);

    List<Reporte11> findBycostoTotalGreaterThanEqual(Double costo);
}
